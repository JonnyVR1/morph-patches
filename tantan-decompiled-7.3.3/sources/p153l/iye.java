package p153l;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.AnyThread;
import androidx.annotation.CheckResult;
import androidx.annotation.ColorInt;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
@AnyThread
public class iye {

    /* JADX INFO: renamed from: m */
    public static final Object f117544m = new Object();

    /* JADX INFO: renamed from: n */
    @GuardedBy("sInstanceLock")
    public static volatile iye f117545n;

    /* JADX INFO: renamed from: b */
    @GuardedBy("mInitLock")
    public final Set<AbstractC17824d> f117547b;

    /* JADX INFO: renamed from: e */
    public final C17822b f117550e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17826f f117551f;

    /* JADX INFO: renamed from: g */
    public final boolean f117552g;

    /* JADX INFO: renamed from: h */
    public final boolean f117553h;

    /* JADX INFO: renamed from: i */
    public final int[] f117554i;

    /* JADX INFO: renamed from: j */
    public final boolean f117555j;

    /* JADX INFO: renamed from: k */
    public final int f117556k;

    /* JADX INFO: renamed from: l */
    public final int f117557l;

    /* JADX INFO: renamed from: a */
    public final ReadWriteLock f117546a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c */
    @GuardedBy("mInitLock")
    public int f117548c = 3;

    /* JADX INFO: renamed from: d */
    public final Handler f117549d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l.iye$a */
    @RequiresApi(19)
    public static final class C17821a extends C17822b {

        /* JADX INFO: renamed from: b */
        public volatile gze f117558b;

        /* JADX INFO: renamed from: c */
        public volatile ha00 f117559c;

        /* JADX INFO: renamed from: l.iye$a$a */
        public class a extends AbstractC17827g {
            public a() {
            }

            @Override // p153l.iye.AbstractC17827g
            /* JADX INFO: renamed from: a */
            public void mo142645a(@Nullable Throwable th) {
                C17821a.this.f117561a.m142632k(th);
            }

            @Override // p153l.iye.AbstractC17827g
            /* JADX INFO: renamed from: b */
            public void mo142646b(@NonNull ha00 ha00Var) {
                C17821a.this.m142644e(ha00Var);
            }
        }

        public C17821a(iye iyeVar) {
            super(iyeVar);
        }

        @Override // p153l.iye.C17822b
        /* JADX INFO: renamed from: a */
        public boolean mo142640a(@NonNull CharSequence charSequence) {
            return this.f117558b.m133087c(charSequence) != null;
        }

        @Override // p153l.iye.C17822b
        /* JADX INFO: renamed from: b */
        public void mo142641b() {
            try {
                this.f117561a.f117551f.mo142652a(new a());
            } catch (Throwable th) {
                this.f117561a.m142632k(th);
            }
        }

        @Override // p153l.iye.C17822b
        /* JADX INFO: renamed from: c */
        public CharSequence mo142642c(@NonNull CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f117558b.m133089i(charSequence, i, i2, i3, z);
        }

        @Override // p153l.iye.C17822b
        /* JADX INFO: renamed from: d */
        public void mo142643d(@NonNull EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f117559c.m134097e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f117561a.f117552g);
        }

        /* JADX INFO: renamed from: e */
        public void m142644e(@NonNull ha00 ha00Var) {
            if (ha00Var == null) {
                this.f117561a.m142632k(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f117559c = ha00Var;
            ha00 ha00Var2 = this.f117559c;
            C17828h c17828h = new C17828h();
            iye iyeVar = this.f117561a;
            this.f117558b = new gze(ha00Var2, c17828h, iyeVar.f117553h, iyeVar.f117554i);
            this.f117561a.m142633l();
        }
    }

    /* JADX INFO: renamed from: l.iye$b */
    public static class C17822b {

        /* JADX INFO: renamed from: a */
        public final iye f117561a;

        public C17822b(iye iyeVar) {
            this.f117561a = iyeVar;
        }

        /* JADX INFO: renamed from: a */
        public boolean mo142640a(@NonNull CharSequence charSequence) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public void mo142641b() {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public CharSequence mo142642c(@NonNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, boolean z) {
            throw null;
        }

        /* JADX INFO: renamed from: d */
        public void mo142643d(@NonNull EditorInfo editorInfo) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: l.iye$c */
    public static abstract class AbstractC17823c {

        /* JADX INFO: renamed from: a */
        public final InterfaceC17826f f117562a;

        /* JADX INFO: renamed from: b */
        public boolean f117563b;

        /* JADX INFO: renamed from: c */
        public boolean f117564c;

        /* JADX INFO: renamed from: d */
        public int[] f117565d;

        /* JADX INFO: renamed from: e */
        public Set<AbstractC17824d> f117566e;

        /* JADX INFO: renamed from: f */
        public boolean f117567f;

        /* JADX INFO: renamed from: g */
        public int f117568g = -16711936;

        /* JADX INFO: renamed from: h */
        public int f117569h = 0;

        public AbstractC17823c(@NonNull InterfaceC17826f interfaceC17826f) {
            yn80.m216776f(interfaceC17826f, "metadataLoader cannot be null.");
            this.f117562a = interfaceC17826f;
        }

        /* JADX INFO: renamed from: a */
        public AbstractC17823c m142647a(@NonNull AbstractC17824d abstractC17824d) {
            yn80.m216776f(abstractC17824d, "initCallback cannot be null");
            if (this.f117566e == null) {
                this.f117566e = new p01();
            }
            this.f117566e.add(abstractC17824d);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public AbstractC17823c m142648b(@ColorInt int i) {
            this.f117568g = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public AbstractC17823c m142649c(boolean z) {
            this.f117563b = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.iye$f */
    public interface InterfaceC17826f {
        /* JADX INFO: renamed from: a */
        void mo142652a(@NonNull AbstractC17827g abstractC17827g);
    }

    /* JADX INFO: renamed from: l.iye$g */
    public static abstract class AbstractC17827g {
        /* JADX INFO: renamed from: a */
        public abstract void mo142645a(@Nullable Throwable th);

        /* JADX INFO: renamed from: b */
        public abstract void mo142646b(@NonNull ha00 ha00Var);
    }

    /* JADX INFO: renamed from: l.iye$h */
    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class C17828h {
        /* JADX INFO: renamed from: a */
        public hze m142653a(@NonNull fze fzeVar) {
            return new noj0(fzeVar);
        }
    }

    public iye(@NonNull AbstractC17823c abstractC17823c) {
        this.f117552g = abstractC17823c.f117563b;
        this.f117553h = abstractC17823c.f117564c;
        this.f117554i = abstractC17823c.f117565d;
        this.f117555j = abstractC17823c.f117567f;
        this.f117556k = abstractC17823c.f117568g;
        this.f117551f = abstractC17823c.f117562a;
        this.f117557l = abstractC17823c.f117569h;
        p01 p01Var = new p01();
        this.f117547b = p01Var;
        Set<AbstractC17824d> set = abstractC17823c.f117566e;
        if (set != null && !set.isEmpty()) {
            p01Var.addAll(abstractC17823c.f117566e);
        }
        this.f117550e = new C17821a(this);
        m142631j();
    }

    /* JADX INFO: renamed from: a */
    public static iye m142622a() {
        iye iyeVar;
        synchronized (f117544m) {
            yn80.m216777g(f117545n != null, "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            iyeVar = f117545n;
        }
        return iyeVar;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m142623d(@NonNull InputConnection inputConnection, @NonNull Editable editable, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, boolean z) {
        return gze.m133082d(inputConnection, editable, i, i2, z);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m142624e(@NonNull Editable editable, int i, KeyEvent keyEvent) {
        return gze.m133083e(editable, i, keyEvent);
    }

    /* JADX INFO: renamed from: g */
    public static iye m142625g(@NonNull AbstractC17823c abstractC17823c) {
        if (f117545n == null) {
            synchronized (f117544m) {
                try {
                    if (f117545n == null) {
                        f117545n = new iye(abstractC17823c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f117545n;
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: b */
    public int m142626b() {
        return this.f117556k;
    }

    /* JADX INFO: renamed from: c */
    public int m142627c() {
        this.f117546a.readLock().lock();
        try {
            return this.f117548c;
        } finally {
            this.f117546a.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m142628f(@NonNull CharSequence charSequence) {
        yn80.m216777g(m142630i(), "Not initialized yet");
        yn80.m216776f(charSequence, "sequence cannot be null");
        return this.f117550e.mo142640a(charSequence);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: h */
    public boolean m142629h() {
        return this.f117555j;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m142630i() {
        return m142627c() == 1;
    }

    /* JADX INFO: renamed from: j */
    public final void m142631j() {
        this.f117546a.writeLock().lock();
        try {
            if (this.f117557l == 0) {
                this.f117548c = 0;
            }
            this.f117546a.writeLock().unlock();
            if (m142627c() == 0) {
                this.f117550e.mo142641b();
            }
        } catch (Throwable th) {
            this.f117546a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m142632k(@Nullable Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f117546a.writeLock().lock();
        try {
            this.f117548c = 2;
            arrayList.addAll(this.f117547b);
            this.f117547b.clear();
            this.f117546a.writeLock().unlock();
            this.f117549d.post(new RunnableC17825e(arrayList, this.f117548c, th));
        } catch (Throwable th2) {
            this.f117546a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m142633l() {
        ArrayList arrayList = new ArrayList();
        this.f117546a.writeLock().lock();
        try {
            this.f117548c = 1;
            arrayList.addAll(this.f117547b);
            this.f117547b.clear();
            this.f117546a.writeLock().unlock();
            this.f117549d.post(new RunnableC17825e(arrayList, this.f117548c));
        } catch (Throwable th) {
            this.f117546a.writeLock().unlock();
            throw th;
        }
    }

    @CheckResult
    /* JADX INFO: renamed from: m */
    public CharSequence m142634m(@NonNull CharSequence charSequence) {
        return m142635n(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    @CheckResult
    /* JADX INFO: renamed from: n */
    public CharSequence m142635n(@NonNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        return m142636o(charSequence, i, i2, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @CheckResult
    /* JADX INFO: renamed from: o */
    public CharSequence m142636o(@NonNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3) {
        return m142637p(charSequence, i, i2, i3, 0);
    }

    @CheckResult
    /* JADX INFO: renamed from: p */
    public CharSequence m142637p(@NonNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, int i4) {
        boolean z;
        yn80.m216777g(m142630i(), "Not initialized yet");
        yn80.m216774d(i, "start cannot be negative");
        yn80.m216774d(i2, "end cannot be negative");
        yn80.m216774d(i3, "maxEmojiCount cannot be negative");
        yn80.m216772b(i <= i2, "start should be <= than end");
        if (charSequence == null) {
            return charSequence;
        }
        yn80.m216772b(i <= charSequence.length(), "start should be < than charSequence length");
        yn80.m216772b(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        if (i4 != 1) {
            z = i4 != 2 ? this.f117552g : false;
        } else {
            z = true;
        }
        return this.f117550e.mo142642c(charSequence, i, i2, i3, z);
    }

    /* JADX INFO: renamed from: q */
    public void m142638q(@NonNull AbstractC17824d abstractC17824d) {
        yn80.m216776f(abstractC17824d, "initCallback cannot be null");
        this.f117546a.writeLock().lock();
        try {
            int i = this.f117548c;
            if (i == 1 || i == 2) {
                this.f117549d.post(new RunnableC17825e(abstractC17824d, i));
            } else {
                this.f117547b.add(abstractC17824d);
            }
        } finally {
            this.f117546a.writeLock().unlock();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: r */
    public void m142639r(@NonNull EditorInfo editorInfo) {
        if (!m142630i() || editorInfo == null || editorInfo.extras == null) {
            return;
        }
        this.f117550e.mo142643d(editorInfo);
    }

    /* JADX INFO: renamed from: l.iye$d */
    public static abstract class AbstractC17824d {
        /* JADX INFO: renamed from: b */
        public void mo142651b() {
        }

        /* JADX INFO: renamed from: a */
        public void m142650a(@Nullable Throwable th) {
        }
    }

    /* JADX INFO: renamed from: l.iye$e */
    public static class RunnableC17825e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final List<AbstractC17824d> f117570a;

        /* JADX INFO: renamed from: b */
        public final Throwable f117571b;

        /* JADX INFO: renamed from: c */
        public final int f117572c;

        public RunnableC17825e(@NonNull AbstractC17824d abstractC17824d, int i) {
            this(Arrays.asList((AbstractC17824d) yn80.m216776f(abstractC17824d, "initCallback cannot be null")), i, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f117570a.size();
            int i = 0;
            if (this.f117572c != 1) {
                while (i < size) {
                    this.f117570a.get(i).m142650a(this.f117571b);
                    i++;
                }
            } else {
                while (i < size) {
                    this.f117570a.get(i).mo142651b();
                    i++;
                }
            }
        }

        public RunnableC17825e(@NonNull Collection<AbstractC17824d> collection, int i) {
            this(collection, i, null);
        }

        public RunnableC17825e(@NonNull Collection<AbstractC17824d> collection, int i, @Nullable Throwable th) {
            yn80.m216776f(collection, "initCallbacks cannot be null");
            this.f117570a = new ArrayList(collection);
            this.f117572c = i;
            this.f117571b = th;
        }
    }
}
