package com.sasstyle.orderservice.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderProductRequest {

    @Schema(description = "상품 아이디", example = "1", required = true)
    private Long productId;

    @Schema(description = "주문 수량", example = "1", required = true)
    private int count;
}
