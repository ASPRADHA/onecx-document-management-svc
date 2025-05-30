package org.onecx.document.management.domain.models.embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

/**
 * TimePeriod class.
 */
@Embeddable
@Getter
@Setter
public class TimePeriod implements Serializable {
    /**
     * The start of the period.
     */
    @Column(name = "START_DATE_TIME")
    private LocalDateTime startDateTime;
    /**
     * The end of the period.
     */
    @Column(name = "END_DATE_TIME")
    private LocalDateTime endDateTime;
}
