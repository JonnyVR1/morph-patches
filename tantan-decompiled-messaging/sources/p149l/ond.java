package p149l;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ond implements xqf {

    /* JADX INFO: renamed from: o */
    public static final int[] f144758o = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* JADX INFO: renamed from: p */
    public static final C18980a f144759p = new C18980a(new C18980a.a() { // from class: l.mnd
        @Override // p149l.ond.C18980a.a
        public final Constructor getConstructor() {
            return ond.m165162g();
        }
    });

    /* JADX INFO: renamed from: q */
    public static final C18980a f144760q = new C18980a(new C18980a.a() { // from class: l.nnd
        @Override // p149l.ond.C18980a.a
        public final Constructor getConstructor() {
            return ond.m165163h();
        }
    });

    /* JADX INFO: renamed from: b */
    public boolean f144761b;

    /* JADX INFO: renamed from: c */
    public boolean f144762c;

    /* JADX INFO: renamed from: d */
    public int f144763d;

    /* JADX INFO: renamed from: e */
    public int f144764e;

    /* JADX INFO: renamed from: f */
    public int f144765f;

    /* JADX INFO: renamed from: g */
    public int f144766g;

    /* JADX INFO: renamed from: h */
    public int f144767h;

    /* JADX INFO: renamed from: i */
    public int f144768i;

    /* JADX INFO: renamed from: j */
    public int f144769j;

    /* JADX INFO: renamed from: l */
    public int f144771l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public ImmutableList<C1871k> f144772m;

    /* JADX INFO: renamed from: k */
    public int f144770k = 1;

    /* JADX INFO: renamed from: n */
    public int f144773n = 112800;

    /* JADX INFO: renamed from: l.ond$a */
    public static final class C18980a {

        /* JADX INFO: renamed from: a */
        public final a f144774a;

        /* JADX INFO: renamed from: b */
        public final AtomicBoolean f144775b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c */
        @Nullable
        @GuardedBy("extensionLoaded")
        public Constructor<? extends sqf> f144776c;

        /* JADX INFO: renamed from: l.ond$a$a */
        public interface a {
            @Nullable
            Constructor<? extends sqf> getConstructor() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException;
        }

        public C18980a(a aVar) {
            this.f144774a = aVar;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public sqf m165166a(Object... objArr) {
            Constructor<? extends sqf> constructorM165167b = m165167b();
            if (constructorM165167b == null) {
                return null;
            }
            try {
                return constructorM165167b.newInstance(objArr);
            } catch (Exception e) {
                byv.m104511a("Unexpected error creating extractor", e);
                return null;
            }
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final Constructor<? extends sqf> m165167b() {
            synchronized (this.f144775b) {
                if (this.f144775b.get()) {
                    return this.f144776c;
                }
                try {
                    return this.f144774a.getConstructor();
                } catch (ClassNotFoundException unused) {
                    this.f144775b.set(true);
                    return this.f144776c;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static Constructor<? extends sqf> m165162g() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(sqf.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static Constructor<? extends sqf> m165163h() throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(sqf.class).getConstructor(null);
    }

    @Override // p149l.xqf
    /* JADX INFO: renamed from: a */
    public synchronized sqf[] mo165164a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = f144758o;
            arrayList = new ArrayList(iArr.length);
            int iM130970b = hhi.m130970b(map);
            if (iM130970b != -1) {
                m165165f(iM130970b, arrayList);
            }
            int iM130971c = hhi.m130971c(uri);
            if (iM130971c != -1 && iM130971c != iM130970b) {
                m165165f(iM130971c, arrayList);
            }
            for (int i : iArr) {
                if (i != iM130970b && i != iM130971c) {
                    m165165f(i, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (sqf[]) arrayList.toArray(new sqf[arrayList.size()]);
    }

    @Override // p149l.xqf
    /* JADX INFO: renamed from: b */
    public synchronized sqf[] mo95334b() {
        return mo165164a(Uri.EMPTY, new HashMap());
    }

    /* JADX INFO: renamed from: f */
    public final void m165165f(int i, List<sqf> list) {
        switch (i) {
            case 0:
                list.add(new C16095c9());
                break;
            case 1:
                list.add(new C17024g9());
                break;
            case 2:
                list.add(new z90(((this.f144763d | (this.f144761b ? 1 : 0)) == true ? 1 : 0) | (this.f144762c ? 2 : 0)));
                break;
            case 3:
                list.add(new gk0(this.f144764e | (this.f144761b ? 1 : 0) | (this.f144762c ? 2 : 0)));
                break;
            case 4:
                sqf sqfVarM165166a = f144759p.m165166a(Integer.valueOf(this.f144765f));
                if (sqfVarM165166a == null) {
                    list.add(new woi(this.f144765f));
                } else {
                    list.add(sqfVarM165166a);
                }
                break;
            case 5:
                list.add(new eti());
                break;
            case 6:
                list.add(new sex(this.f144766g));
                break;
            case 7:
                list.add(new py00(this.f144769j | (this.f144761b ? 1 : 0) | (this.f144762c ? 2 : 0)));
                break;
            case 8:
                list.add(new i3j(this.f144768i));
                list.add(new sy00(this.f144767h));
                break;
            case 9:
                list.add(new b850());
                break;
            case 10:
                list.add(new oza0());
                break;
            case 11:
                if (this.f144772m == null) {
                    this.f144772m = ImmutableList.m15685of();
                }
                list.add(new ebj0(this.f144770k, new eri0(0L), new xrd(this.f144771l, this.f144772m), this.f144773n));
                break;
            case 12:
                list.add(new hgp0());
                break;
            case 14:
                list.add(new wnq());
                break;
            case 15:
                sqf sqfVarM165166a2 = f144760q.m165166a(new Object[0]);
                if (sqfVarM165166a2 != null) {
                    list.add(sqfVarM165166a2);
                }
                break;
            case 16:
                list.add(new mp1());
                break;
        }
    }
}
