package com.indeed.operators.rabbitmq.model.crd.rabbitmq;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.sundr.builder.annotations.Buildable;

@Buildable(
        builderPackage = "io.fabric8.kubernetes.api.builder",
        editableEnabled = false
)
@JsonPropertyOrder({"vhost", "name", "pattern", "applyTo", "definition", "priority"})
@JsonDeserialize(using = JsonDeserializer.None.class)
public class PolicySpec {

    private String vhost;
    private String name;
    private String pattern;
    private String applyTo;
    private PolicyDefinitionSpec definition;
    private long priority;

    public PolicySpec(
            @JsonProperty("vhost") final String vhost,
            @JsonProperty("name") final String name,
            @JsonProperty("pattern") final String pattern,
            @JsonProperty("applyTo") final String applyTo,
            @JsonProperty("definition") final PolicyDefinitionSpec definition,
            @JsonProperty("priority") final long priority
    ) {
        this.vhost = vhost;
        this.name = name;
        this.pattern = pattern;
        this.applyTo = applyTo;
        this.definition = definition;
        this.priority = priority;
    }

    public String getVhost() {
        return vhost;
    }

    public String getName() {
        return name;
    }

    public String getPattern() {
        return pattern;
    }

    public String getApplyTo() {
        return applyTo;
    }

    public PolicyDefinitionSpec getDefinition() {
        return definition;
    }

    public long getPriority() {
        return priority;
    }
}
