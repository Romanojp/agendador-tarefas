package com.javanauta.agendador_tarefas.controller;

import com.javanauta.agendador_tarefas.business.TarefaService;
import com.javanauta.agendador_tarefas.business.dto.TarefasDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tarefas")
@RequiredArgsConstructor
public class TarefasController {
    private final TarefaService tarefasService;

    @PostMapping
    public ResponseEntity<TarefasDto> gravarTarefas(@RequestBody TarefasDto dto,
                                                    @RequestHeader ("Authorization") String token) {

        return ResponseEntity.ok(tarefasService.gravarTarefa(token, dto));
    }

}
