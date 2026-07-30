package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class LazyFieldLite {

    /* JADX INFO: renamed from: a */
    public ByteString f66348a;

    /* JADX INFO: renamed from: b */
    public ExtensionRegistryLite f66349b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f66350c;

    /* JADX INFO: renamed from: d */
    public volatile MessageLite f66351d;

    /* JADX INFO: renamed from: a */
    public void m92242a(MessageLite messageLite) {
        if (this.f66351d != null) {
            return;
        }
        synchronized (this) {
            if (this.f66351d != null) {
                return;
            }
            try {
                if (this.f66348a != null) {
                    this.f66351d = messageLite.getParserForType().mo92027c(this.f66348a, this.f66349b);
                } else {
                    this.f66351d = messageLite;
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m92243b() {
        return this.f66350c ? this.f66351d.getSerializedSize() : this.f66348a.size();
    }

    /* JADX INFO: renamed from: c */
    public MessageLite m92244c(MessageLite messageLite) {
        m92242a(messageLite);
        return this.f66351d;
    }

    /* JADX INFO: renamed from: d */
    public MessageLite m92245d(MessageLite messageLite) {
        MessageLite messageLite2 = this.f66351d;
        this.f66351d = messageLite;
        this.f66348a = null;
        this.f66350c = true;
        return messageLite2;
    }
}
