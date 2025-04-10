package com.uade.tpo.marketplace.entity.dto;

import lombok.Data;

//Este DTO es solo para recibir datos del cliente cuando quiere crear (o editar) un producto
@Data
public class CategoryRequest {
    private int id;
    private String description;
}
