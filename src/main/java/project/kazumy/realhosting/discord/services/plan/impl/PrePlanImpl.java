package project.kazumy.realhosting.discord.services.plan.impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import net.dv8tion.jda.api.entities.emoji.UnicodeEmoji;
import project.kazumy.realhosting.discord.services.plan.pre.PrePlan;
import project.kazumy.realhosting.discord.services.plan.pre.PlanHardware;

import java.io.File;
import java.math.BigDecimal;

@Getter
@ToString
@RequiredArgsConstructor
public class PrePlanImpl implements PrePlan {

    private final String id, title, type, description;
    private final BigDecimal price;
    private final UnicodeEmoji emoji;
    private final File logo;
    private final PlanHardware hardware;
}
