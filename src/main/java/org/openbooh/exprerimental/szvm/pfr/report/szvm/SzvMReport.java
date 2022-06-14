package org.openbooh.exprerimental.szvm.pfr.report.szvm;

import lombok.RequiredArgsConstructor;
import org.openbooh.exprerimental.szvm.domain.pfr.PfrRegistration;

import java.time.ZonedDateTime;
import java.util.UUID;

@RequiredArgsConstructor
public class SzvMReport {

    /**
     * Глобальный идентификатор электронного документа, присваиваемый составителем.
     * <p>
     * АФ:GUID
     * <p>
     * Составляется согласно RFC4122. А согласно схеме - может быть любая последовательность символов.
     * Поэтому в данном классе используется {@link java.util.UUID}, хоть это и частный случай.
     *
     * Т.к. данный идентификатор является внешним, и чтобы не пересекалось с обычным идентификатором,
     * то это поле названо uid. Не GUID (т.к. может быть и UUID), не UUID (потому что в схеме GUID), а просто uid;
     */
    private final UUID uid;

    /**
     * Дата и время формирования электронного документа.
     * <p>
     * АФ3:ТипСлужебнаяИнформация -> АФ:ДатаВремя -> xs:dateTime
     * <p>
     * Согласно определению, а также примерам - содержит таймзону.
     */
    private final ZonedDateTime generatedDateTime;

    /**
     * Объект регистрации в ТО ПФР.
     *
     * Содержит необходимые коды для регистрации
     */
    private final PfrRegistration pfrRegistration;
}
