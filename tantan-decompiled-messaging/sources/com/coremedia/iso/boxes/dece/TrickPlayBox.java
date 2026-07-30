package com.coremedia.iso.boxes.dece;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class TrickPlayBox extends AbstractFullBox {
    public static final String TYPE = "trik";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private List<C1402a> entries;

    static {
        ajc$preClinit();
    }

    public TrickPlayBox() {
        super(TYPE);
        this.entries = new ArrayList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TrickPlayBox.java", TrickPlayBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.dece.TrickPlayBox", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", Constants.VOID), 32);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.dece.TrickPlayBox", "", "", "", "java.util.List"), 36);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.dece.TrickPlayBox", "", "", "", "java.lang.String"), 103);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        while (byteBuffer.remaining() > 0) {
            this.entries.add(new C1402a(yyp.m216561n(byteBuffer)));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        Iterator<C1402a> it = this.entries.iterator();
        while (it.hasNext()) {
            bzp.m104638j(byteBuffer, it.next().f5769a);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return this.entries.size() + 4;
    }

    public List<C1402a> getEntries() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.entries;
    }

    public void setEntries(List<C1402a> list) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this, list));
        this.entries = list;
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return "TrickPlayBox{entries=" + this.entries + '}';
    }

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.dece.TrickPlayBox$a */
    public static class C1402a {

        /* JADX INFO: renamed from: a */
        private int f5769a;

        public C1402a(int i) {
            this.f5769a = i;
        }

        /* JADX INFO: renamed from: b */
        public int m7362b() {
            return this.f5769a & 63;
        }

        /* JADX INFO: renamed from: c */
        public int m7363c() {
            return (this.f5769a >> 6) & 3;
        }

        public String toString() {
            return "Entry{picType=" + m7363c() + ",dependencyLevel=" + m7362b() + '}';
        }

        public C1402a() {
        }
    }
}
