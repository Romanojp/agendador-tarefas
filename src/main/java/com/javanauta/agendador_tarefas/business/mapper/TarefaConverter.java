package com.javanauta.agendador_tarefas.business.mapper;

import com.javanauta.agendador_tarefas.business.dto.TarefasDto;
import com.javanauta.agendador_tarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefaConverter {

    TarefasEntity paraTarefasEntity(TarefasDto dto);

    TarefasDto paraTarefasDto(TarefasEntity entity);
}
