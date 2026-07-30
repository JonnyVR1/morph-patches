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
import p153l.b1q;
import p153l.f3d0;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public class TrickPlayBox extends AbstractFullBox {
    public static final String TYPE = "trik";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private List<C1425a> entries;

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
            this.entries.add(new C1425a(y0q.m213898n(byteBuffer)));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        Iterator<C1425a> it = this.entries.iterator();
        while (it.hasNext()) {
            b1q.m101498j(byteBuffer, it.next().f5806a);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return this.entries.size() + 4;
    }

    public List<C1425a> getEntries() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.entries;
    }

    public void setEntries(List<C1425a> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this, list));
        this.entries = list;
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return "TrickPlayBox{entries=" + this.entries + '}';
    }

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.dece.TrickPlayBox$a */
    public static class C1425a {

        /* JADX INFO: renamed from: a */
        private int f5806a;

        public C1425a(int i) {
            this.f5806a = i;
        }

        /* JADX INFO: renamed from: b */
        public int m7416b() {
            return this.f5806a & 63;
        }

        /* JADX INFO: renamed from: c */
        public int m7417c() {
            return (this.f5806a >> 6) & 3;
        }

        public String toString() {
            return "Entry{picType=" + m7417c() + ",dependencyLevel=" + m7416b() + '}';
        }

        public C1425a() {
        }
    }
}
