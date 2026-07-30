package p149l;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class lce0 {

    /* JADX INFO: renamed from: d */
    public static final kpf0 f127398d = kpf0.m146844d(':');

    /* JADX INFO: renamed from: e */
    public static final kpf0 f127399e = kpf0.m146844d('*');

    /* JADX INFO: renamed from: a */
    public final List<C18187a> f127400a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public int f127401b = 0;

    /* JADX INFO: renamed from: c */
    public int f127402c;

    /* JADX INFO: renamed from: l.lce0$a */
    public static final class C18187a {

        /* JADX INFO: renamed from: a */
        public final int f127403a;

        /* JADX INFO: renamed from: b */
        public final long f127404b;

        /* JADX INFO: renamed from: c */
        public final int f127405c;

        public C18187a(int i, long j, int i2) {
            this.f127403a = i;
            this.f127404b = j;
            this.f127405c = i2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m149287b(String str) throws ParserException {
        str.getClass();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw ParserException.createForMalformedContainer("Invalid SEF name", null);
        }
    }

    /* JADX INFO: renamed from: f */
    public static SlowMotionData m149288f(d860 d860Var, int i) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> listM146846f = f127399e.m146846f(d860Var.m110276E(i));
        for (int i2 = 0; i2 < listM146846f.size(); i2++) {
            List<String> listM146846f2 = f127398d.m146846f(listM146846f.get(i2));
            if (listM146846f2.size() != 3) {
                throw ParserException.createForMalformedContainer(null, null);
            }
            try {
                arrayList.add(new SlowMotionData.Segment(Long.parseLong(listM146846f2.get(0)), Long.parseLong(listM146846f2.get(1)), 1 << (Integer.parseInt(listM146846f2.get(2)) - 1)));
            } catch (NumberFormatException e) {
                throw ParserException.createForMalformedContainer(null, e);
            }
        }
        return new SlowMotionData(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final void m149289a(tqf tqfVar, fd80 fd80Var) throws IOException {
        d860 d860Var = new d860(8);
        tqfVar.readFully(d860Var.m110299e(), 0, 8);
        this.f127402c = d860Var.m110315u() + 8;
        if (d860Var.m110311q() != 1397048916) {
            fd80Var.f97018a = 0L;
        } else {
            fd80Var.f97018a = tqfVar.getPosition() - ((long) (this.f127402c - 12));
            this.f127401b = 2;
        }
    }

    /* JADX INFO: renamed from: c */
    public int m149290c(tqf tqfVar, fd80 fd80Var, List<Metadata.Entry> list) throws IOException {
        int i = this.f127401b;
        long j = 0;
        if (i == 0) {
            long length = tqfVar.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            fd80Var.f97018a = j;
            this.f127401b = 1;
        } else if (i == 1) {
            m149289a(tqfVar, fd80Var);
        } else if (i == 2) {
            m149291d(tqfVar, fd80Var);
        } else {
            if (i != 3) {
                ohg0.m164364a();
                return 0;
            }
            m149292e(tqfVar, list);
            fd80Var.f97018a = 0L;
        }
        return 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m149291d(tqf tqfVar, fd80 fd80Var) throws IOException {
        long length = tqfVar.getLength();
        int i = this.f127402c - 20;
        d860 d860Var = new d860(i);
        tqfVar.readFully(d860Var.m110299e(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            d860Var.m110293V(2);
            short sM110317w = d860Var.m110317w();
            if (sM110317w == 2192 || sM110317w == 2816 || sM110317w == 2817 || sM110317w == 2819 || sM110317w == 2820) {
                this.f127400a.add(new C18187a(sM110317w, (length - ((long) this.f127402c)) - ((long) d860Var.m110315u()), d860Var.m110315u()));
            } else {
                d860Var.m110293V(8);
            }
        }
        if (this.f127400a.isEmpty()) {
            fd80Var.f97018a = 0L;
        } else {
            this.f127401b = 3;
            fd80Var.f97018a = this.f127400a.get(0).f127404b;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m149292e(tqf tqfVar, List<Metadata.Entry> list) throws IOException {
        long position = tqfVar.getPosition();
        int length = (int) ((tqfVar.getLength() - tqfVar.getPosition()) - ((long) this.f127402c));
        d860 d860Var = new d860(length);
        tqfVar.readFully(d860Var.m110299e(), 0, length);
        for (int i = 0; i < this.f127400a.size(); i++) {
            C18187a c18187a = this.f127400a.get(i);
            d860Var.m110292U((int) (c18187a.f127404b - position));
            d860Var.m110293V(4);
            int iM110315u = d860Var.m110315u();
            int iM149287b = m149287b(d860Var.m110276E(iM110315u));
            int i2 = c18187a.f127405c - (iM110315u + 8);
            if (iM149287b == 2192) {
                list.add(m149288f(d860Var, i2));
            } else if (iM149287b != 2816 && iM149287b != 2817 && iM149287b != 2819 && iM149287b != 2820) {
                ohg0.m164364a();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m149293g() {
        this.f127400a.clear();
        this.f127401b = 0;
    }
}
