package it.hurts.sskirillss.relics.indev;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.Map;

@Data
@Builder
public class RelicAbilityData {
    @Singular("ability")
    public Map<String, RelicAbilityEntry> abilities;
}