package p153l;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
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
public final class tod implements esf {

    /* JADX INFO: renamed from: o */
    public static final int[] f175376o = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* JADX INFO: renamed from: p */
    public static final C20360a f175377p = new C20360a(new C20360a.a() { // from class: l.rod
        @Override // p153l.tod.C20360a.a
        public final Constructor getConstructor() {
            return tod.m192015g();
        }
    });

    /* JADX INFO: renamed from: q */
    public static final C20360a f175378q = new C20360a(new C20360a.a() { // from class: l.sod
        @Override // p153l.tod.C20360a.a
        public final Constructor getConstructor() {
            return tod.m192016h();
        }
    });

    /* JADX INFO: renamed from: b */
    public boolean f175379b;

    /* JADX INFO: renamed from: c */
    public boolean f175380c;

    /* JADX INFO: renamed from: d */
    public int f175381d;

    /* JADX INFO: renamed from: e */
    public int f175382e;

    /* JADX INFO: renamed from: f */
    public int f175383f;

    /* JADX INFO: renamed from: g */
    public int f175384g;

    /* JADX INFO: renamed from: h */
    public int f175385h;

    /* JADX INFO: renamed from: i */
    public int f175386i;

    /* JADX INFO: renamed from: j */
    public int f175387j;

    /* JADX INFO: renamed from: l */
    public int f175389l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public ImmutableList<C1894k> f175390m;

    /* JADX INFO: renamed from: k */
    public int f175388k = 1;

    /* JADX INFO: renamed from: n */
    public int f175391n = 112800;

    /* JADX INFO: renamed from: l.tod$a */
    public static final class C20360a {

        /* JADX INFO: renamed from: a */
        public final a f175392a;

        /* JADX INFO: renamed from: b */
        public final AtomicBoolean f175393b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c */
        @Nullable
        @GuardedBy("extensionLoaded")
        public Constructor<? extends zrf> f175394c;

        /* JADX INFO: renamed from: l.tod$a$a */
        public interface a {
            @Nullable
            Constructor<? extends zrf> getConstructor() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException;
        }

        public C20360a(a aVar) {
            this.f175392a = aVar;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public zrf m192018a(Object... objArr) {
            Constructor<? extends zrf> constructorM192019b = m192019b();
            if (constructorM192019b == null) {
                return null;
            }
            try {
                return constructorM192019b.newInstance(objArr);
            } catch (Exception e) {
                yzv.m218057a("Unexpected error creating extractor", e);
                return null;
            }
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final Constructor<? extends zrf> m192019b() {
            synchronized (this.f175393b) {
                if (this.f175393b.get()) {
                    return this.f175394c;
                }
                try {
                    return this.f175392a.getConstructor();
                } catch (ClassNotFoundException unused) {
                    this.f175393b.set(true);
                    return this.f175394c;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static Constructor<? extends zrf> m192015g() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(zrf.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static Constructor<? extends zrf> m192016h() throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(zrf.class).getConstructor(null);
    }

    @Override // p153l.esf
    /* JADX INFO: renamed from: a */
    public synchronized zrf[] mo122322a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = f175376o;
            arrayList = new ArrayList(iArr.length);
            int iM121048b = eki.m121048b(map);
            if (iM121048b != -1) {
                m192017f(iM121048b, arrayList);
            }
            int iM121049c = eki.m121049c(uri);
            if (iM121049c != -1 && iM121049c != iM121048b) {
                m192017f(iM121049c, arrayList);
            }
            for (int i : iArr) {
                if (i != iM121048b && i != iM121049c) {
                    m192017f(i, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (zrf[]) arrayList.toArray(new zrf[arrayList.size()]);
    }

    @Override // p153l.esf
    /* JADX INFO: renamed from: b */
    public synchronized zrf[] mo96504b() {
        return mo122322a(Uri.EMPTY, new HashMap());
    }

    /* JADX INFO: renamed from: f */
    public final void m192017f(int i, List<zrf> list) {
        switch (i) {
            case 0:
                list.add(new C21263x8());
                break;
            case 1:
                list.add(new C15947b9());
                break;
            case 2:
                list.add(new v90(((this.f175381d | (this.f175379b ? 1 : 0)) == true ? 1 : 0) | (this.f175380c ? 2 : 0)));
                break;
            case 3:
                list.add(new ck0(this.f175382e | (this.f175379b ? 1 : 0) | (this.f175380c ? 2 : 0)));
                break;
            case 4:
                zrf zrfVarM192018a = f175377p.m192018a(Integer.valueOf(this.f175383f));
                if (zrfVarM192018a == null) {
                    list.add(new sri(this.f175383f));
                } else {
                    list.add(zrfVarM192018a);
                }
                break;
            case 5:
                list.add(new awi());
                break;
            case 6:
                list.add(new rhx(this.f175384g));
                break;
            case 7:
                list.add(new z610(this.f175387j | (this.f175379b ? 1 : 0) | (this.f175380c ? 2 : 0)));
                break;
            case 8:
                list.add(new d6j(this.f175386i));
                list.add(new c710(this.f175385h));
                break;
            case 9:
                list.add(new ig50());
                break;
            case 10:
                list.add(new s7b0());
                break;
            case 11:
                if (this.f175390m == null) {
                    this.f175390m = ImmutableList.m15739of();
                }
                list.add(new ikj0(this.f175388k, new h0j0(0L), new mtd(this.f175389l, this.f175390m), this.f175391n));
                break;
            case 12:
                list.add(new lpp0());
                break;
            case 14:
                list.add(new vpq());
                break;
            case 15:
                zrf zrfVarM192018a2 = f175378q.m192018a(new Object[0]);
                if (zrfVarM192018a2 != null) {
                    list.add(zrfVarM192018a2);
                }
                break;
            case 16:
                list.add(new tp1());
                break;
        }
    }
}
