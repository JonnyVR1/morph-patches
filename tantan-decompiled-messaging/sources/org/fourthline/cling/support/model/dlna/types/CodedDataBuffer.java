package org.fourthline.cling.support.model.dlna.types;

/* JADX INFO: loaded from: classes3.dex */
public class CodedDataBuffer {
    private Long size;
    private TransferMechanism tranfer;

    public enum TransferMechanism {
        IMMEDIATELY,
        TIMESTAMP,
        OTHER
    }

    public CodedDataBuffer(Long l2, TransferMechanism transferMechanism) {
        this.size = l2;
        this.tranfer = transferMechanism;
    }

    public Long getSize() {
        return this.size;
    }

    public TransferMechanism getTranfer() {
        return this.tranfer;
    }
}
