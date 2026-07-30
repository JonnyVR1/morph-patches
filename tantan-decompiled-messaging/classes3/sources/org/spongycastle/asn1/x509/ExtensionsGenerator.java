package org.spongycastle.asn1.x509;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import l.all;
import l.qtc0;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DEROctetString;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ExtensionsGenerator {
    private Hashtable extensions = new Hashtable();
    private Vector extOrdering = new Vector();

    public void addExtension(Extension extension) {
        if (this.extensions.containsKey(extension.getExtnId())) {
            all.a("extension ", extension.getExtnId(), " already added");
        } else {
            this.extOrdering.addElement(extension.getExtnId());
            this.extensions.put(extension.getExtnId(), extension);
        }
    }

    public Extensions generate() {
        Extension[] extensionArr = new Extension[this.extOrdering.size()];
        for (int i = 0; i != this.extOrdering.size(); i++) {
            extensionArr[i] = (Extension) this.extensions.get(this.extOrdering.elementAt(i));
        }
        return new Extensions(extensionArr);
    }

    public boolean isEmpty() {
        return this.extOrdering.isEmpty();
    }

    public void reset() {
        this.extensions = new Hashtable();
        this.extOrdering = new Vector();
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, byte[] bArr) {
        if (!this.extensions.containsKey(aSN1ObjectIdentifier)) {
            this.extOrdering.addElement(aSN1ObjectIdentifier);
            this.extensions.put(aSN1ObjectIdentifier, new Extension(aSN1ObjectIdentifier, z, new DEROctetString(bArr)));
        } else {
            qtc0.a("extension ", aSN1ObjectIdentifier, " already added");
        }
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, ASN1Encodable aSN1Encodable) throws IOException {
        addExtension(aSN1ObjectIdentifier, z, aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER));
    }
}
