package com.cleancode.houseutils.constants;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ActionType {
    PURCHASE("먜먜"),
    RENT("임대차");

    private String description;
}
