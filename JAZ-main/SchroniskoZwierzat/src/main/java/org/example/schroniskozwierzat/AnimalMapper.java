package org.example.schroniskozwierzat;

import com.example.api.model.AnimalRequest;
import com.example.api.model.AnimalResponse;
import org.mapstruct.*;


@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface AnimalMapper {

    @Mapping(target = "id", ignore = true)
    Animal mapToAnimal(AnimalRequest request);

    AnimalResponse mapEntityToResponse(Animal entity);

    @Mapping(target = "id", ignore = true)
    Animal update(AnimalRequest request, @MappingTarget Animal animal);
}

