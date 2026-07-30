package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class LazyFieldLite {

    /* JADX INFO: renamed from: a */
    public ByteString f65674a;

    /* JADX INFO: renamed from: b */
    public ExtensionRegistryLite f65675b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f65676c;

    /* JADX INFO: renamed from: d */
    public volatile MessageLite f65677d;

    /* JADX INFO: renamed from: a */
    public void m91351a(MessageLite messageLite) {
        if (this.f65677d != null) {
            return;
        }
        synchronized (this) {
            if (this.f65677d != null) {
                return;
            }
            try {
                if (this.f65674a != null) {
                    this.f65677d = messageLite.getParserForType().mo91136c(this.f65674a, this.f65675b);
                } else {
                    this.f65677d = messageLite;
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m91352b() {
        return this.f65676c ? this.f65677d.getSerializedSize() : this.f65674a.size();
    }

    /* JADX INFO: renamed from: c */
    public MessageLite m91353c(MessageLite messageLite) {
        m91351a(messageLite);
        return this.f65677d;
    }

    /* JADX INFO: renamed from: d */
    public MessageLite m91354d(MessageLite messageLite) {
        MessageLite messageLite2 = this.f65677d;
        this.f65677d = messageLite;
        this.f65674a = null;
        this.f65676c = true;
        return messageLite2;
    }
}
