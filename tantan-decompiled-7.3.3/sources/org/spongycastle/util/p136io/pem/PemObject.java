package org.spongycastle.util.p136io.pem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PemObject implements PemObjectGenerator {
    private static final List EMPTY_LIST = Collections.unmodifiableList(new ArrayList());
    private byte[] content;
    private List headers;
    private String type;

    public PemObject(String str, List list, byte[] bArr) {
        this.type = str;
        this.headers = Collections.unmodifiableList(list);
        this.content = bArr;
    }

    @Override // org.spongycastle.util.p136io.pem.PemObjectGenerator
    public PemObject generate() throws PemGenerationException {
        return this;
    }

    public byte[] getContent() {
        return this.content;
    }

    public List getHeaders() {
        return this.headers;
    }

    public String getType() {
        return this.type;
    }

    public PemObject(String str, byte[] bArr) {
        this(str, EMPTY_LIST, bArr);
    }
}
