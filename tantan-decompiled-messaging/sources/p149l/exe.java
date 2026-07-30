package p149l;

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
public class exe {

    /* JADX INFO: renamed from: m */
    public static final Object f93624m = new Object();

    /* JADX INFO: renamed from: n */
    @GuardedBy("sInstanceLock")
    public static volatile exe f93625n;

    /* JADX INFO: renamed from: b */
    @GuardedBy("mInitLock")
    public final Set<AbstractC16712d> f93627b;

    /* JADX INFO: renamed from: e */
    public final C16710b f93630e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC16714f f93631f;

    /* JADX INFO: renamed from: g */
    public final boolean f93632g;

    /* JADX INFO: renamed from: h */
    public final boolean f93633h;

    /* JADX INFO: renamed from: i */
    public final int[] f93634i;

    /* JADX INFO: renamed from: j */
    public final boolean f93635j;

    /* JADX INFO: renamed from: k */
    public final int f93636k;

    /* JADX INFO: renamed from: l */
    public final int f93637l;

    /* JADX INFO: renamed from: a */
    public final ReadWriteLock f93626a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c */
    @GuardedBy("mInitLock")
    public int f93628c = 3;

    /* JADX INFO: renamed from: d */
    public final Handler f93629d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l.exe$a */
    @RequiresApi(19)
    public static final class C16709a extends C16710b {

        /* JADX INFO: renamed from: b */
        public volatile cye f93638b;

        /* JADX INFO: renamed from: c */
        public volatile k100 f93639c;

        /* JADX INFO: renamed from: l.exe$a$a */
        public class a extends AbstractC16715g {
            public a() {
            }

            @Override // p149l.exe.AbstractC16715g
            /* JADX INFO: renamed from: a */
            public void mo118654a(@Nullable Throwable th) {
                C16709a.this.f93641a.m118641k(th);
            }

            @Override // p149l.exe.AbstractC16715g
            /* JADX INFO: renamed from: b */
            public void mo118655b(@NonNull k100 k100Var) {
                C16709a.this.m118653e(k100Var);
            }
        }

        public C16709a(exe exeVar) {
            super(exeVar);
        }

        @Override // p149l.exe.C16710b
        /* JADX INFO: renamed from: a */
        public boolean mo118649a(@NonNull CharSequence charSequence) {
            return this.f93638b.m109294c(charSequence) != null;
        }

        @Override // p149l.exe.C16710b
        /* JADX INFO: renamed from: b */
        public void mo118650b() {
            try {
                this.f93641a.f93631f.mo118661a(new a());
            } catch (Throwable th) {
                this.f93641a.m118641k(th);
            }
        }

        @Override // p149l.exe.C16710b
        /* JADX INFO: renamed from: c */
        public CharSequence mo118651c(@NonNull CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f93638b.m109296i(charSequence, i, i2, i3, z);
        }

        @Override // p149l.exe.C16710b
        /* JADX INFO: renamed from: d */
        public void mo118652d(@NonNull EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f93639c.m144130e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f93641a.f93632g);
        }

        /* JADX INFO: renamed from: e */
        public void m118653e(@NonNull k100 k100Var) {
            if (k100Var == null) {
                this.f93641a.m118641k(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f93639c = k100Var;
            k100 k100Var2 = this.f93639c;
            C16716h c16716h = new C16716h();
            exe exeVar = this.f93641a;
            this.f93638b = new cye(k100Var2, c16716h, exeVar.f93633h, exeVar.f93634i);
            this.f93641a.m118642l();
        }
    }

    /* JADX INFO: renamed from: l.exe$b */
    public static class C16710b {

        /* JADX INFO: renamed from: a */
        public final exe f93641a;

        public C16710b(exe exeVar) {
            this.f93641a = exeVar;
        }

        /* JADX INFO: renamed from: a */
        public boolean mo118649a(@NonNull CharSequence charSequence) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public void mo118650b() {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public CharSequence mo118651c(@NonNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, boolean z) {
            throw null;
        }

        /* JADX INFO: renamed from: d */
        public void mo118652d(@NonNull EditorInfo editorInfo) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: l.exe$c */
    public static abstract class AbstractC16711c {

        /* JADX INFO: renamed from: a */
        public final InterfaceC16714f f93642a;

        /* JADX INFO: renamed from: b */
        public boolean f93643b;

        /* JADX INFO: renamed from: c */
        public boolean f93644c;

        /* JADX INFO: renamed from: d */
        public int[] f93645d;

        /* JADX INFO: renamed from: e */
        public Set<AbstractC16712d> f93646e;

        /* JADX INFO: renamed from: f */
        public boolean f93647f;

        /* JADX INFO: renamed from: g */
        public int f93648g = -16711936;

        /* JADX INFO: renamed from: h */
        public int f93649h = 0;

        public AbstractC16711c(@NonNull InterfaceC16714f interfaceC16714f) {
            tf80.m188659f(interfaceC16714f, "metadataLoader cannot be null.");
            this.f93642a = interfaceC16714f;
        }

        /* JADX INFO: renamed from: a */
        public AbstractC16711c m118656a(@NonNull AbstractC16712d abstractC16712d) {
            tf80.m188659f(abstractC16712d, "initCallback cannot be null");
            if (this.f93646e == null) {
                this.f93646e = new i01();
            }
            this.f93646e.add(abstractC16712d);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public AbstractC16711c m118657b(@ColorInt int i) {
            this.f93648g = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public AbstractC16711c m118658c(boolean z) {
            this.f93643b = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.exe$f */
    public interface InterfaceC16714f {
        /* JADX INFO: renamed from: a */
        void mo118661a(@NonNull AbstractC16715g abstractC16715g);
    }

    /* JADX INFO: renamed from: l.exe$g */
    public static abstract class AbstractC16715g {
        /* JADX INFO: renamed from: a */
        public abstract void mo118654a(@Nullable Throwable th);

        /* JADX INFO: renamed from: b */
        public abstract void mo118655b(@NonNull k100 k100Var);
    }

    /* JADX INFO: renamed from: l.exe$h */
    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class C16716h {
        /* JADX INFO: renamed from: a */
        public dye m118662a(@NonNull bye byeVar) {
            return new jfj0(byeVar);
        }
    }

    public exe(@NonNull AbstractC16711c abstractC16711c) {
        this.f93632g = abstractC16711c.f93643b;
        this.f93633h = abstractC16711c.f93644c;
        this.f93634i = abstractC16711c.f93645d;
        this.f93635j = abstractC16711c.f93647f;
        this.f93636k = abstractC16711c.f93648g;
        this.f93631f = abstractC16711c.f93642a;
        this.f93637l = abstractC16711c.f93649h;
        i01 i01Var = new i01();
        this.f93627b = i01Var;
        Set<AbstractC16712d> set = abstractC16711c.f93646e;
        if (set != null && !set.isEmpty()) {
            i01Var.addAll(abstractC16711c.f93646e);
        }
        this.f93630e = new C16709a(this);
        m118640j();
    }

    /* JADX INFO: renamed from: a */
    public static exe m118631a() {
        exe exeVar;
        synchronized (f93624m) {
            tf80.m188660g(f93625n != null, "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            exeVar = f93625n;
        }
        return exeVar;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m118632d(@NonNull InputConnection inputConnection, @NonNull Editable editable, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, boolean z) {
        return cye.m109289d(inputConnection, editable, i, i2, z);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m118633e(@NonNull Editable editable, int i, KeyEvent keyEvent) {
        return cye.m109290e(editable, i, keyEvent);
    }

    /* JADX INFO: renamed from: g */
    public static exe m118634g(@NonNull AbstractC16711c abstractC16711c) {
        if (f93625n == null) {
            synchronized (f93624m) {
                try {
                    if (f93625n == null) {
                        f93625n = new exe(abstractC16711c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f93625n;
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: b */
    public int m118635b() {
        return this.f93636k;
    }

    /* JADX INFO: renamed from: c */
    public int m118636c() {
        this.f93626a.readLock().lock();
        try {
            return this.f93628c;
        } finally {
            this.f93626a.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m118637f(@NonNull CharSequence charSequence) {
        tf80.m188660g(m118639i(), "Not initialized yet");
        tf80.m188659f(charSequence, "sequence cannot be null");
        return this.f93630e.mo118649a(charSequence);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: h */
    public boolean m118638h() {
        return this.f93635j;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m118639i() {
        return m118636c() == 1;
    }

    /* JADX INFO: renamed from: j */
    public final void m118640j() {
        this.f93626a.writeLock().lock();
        try {
            if (this.f93637l == 0) {
                this.f93628c = 0;
            }
            this.f93626a.writeLock().unlock();
            if (m118636c() == 0) {
                this.f93630e.mo118650b();
            }
        } catch (Throwable th) {
            this.f93626a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m118641k(@Nullable Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f93626a.writeLock().lock();
        try {
            this.f93628c = 2;
            arrayList.addAll(this.f93627b);
            this.f93627b.clear();
            this.f93626a.writeLock().unlock();
            this.f93629d.post(new RunnableC16713e(arrayList, this.f93628c, th));
        } catch (Throwable th2) {
            this.f93626a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m118642l() {
        ArrayList arrayList = new ArrayList();
        this.f93626a.writeLock().lock();
        try {
            this.f93628c = 1;
            arrayList.addAll(this.f93627b);
            this.f93627b.clear();
            this.f93626a.writeLock().unlock();
            this.f93629d.post(new RunnableC16713e(arrayList, this.f93628c));
        } catch (Throwable th) {
            this.f93626a.writeLock().unlock();
            throw th;
        }
    }

    @CheckResult
    /* JADX INFO: renamed from: m */
    public CharSequence m118643m(@NonNull CharSequence charSequence) {
        return m118644n(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    @CheckResult
    /* JADX INFO: renamed from: n */
    public CharSequence m118644n(@NonNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        return m118645o(charSequence, i, i2, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @CheckResult
    /* JADX INFO: renamed from: o */
    public CharSequence m118645o(@NonNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3) {
        return m118646p(charSequence, i, i2, i3, 0);
    }

    @CheckResult
    /* JADX INFO: renamed from: p */
    public CharSequence m118646p(@NonNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, int i4) {
        boolean z;
        tf80.m188660g(m118639i(), "Not initialized yet");
        tf80.m188657d(i, "start cannot be negative");
        tf80.m188657d(i2, "end cannot be negative");
        tf80.m188657d(i3, "maxEmojiCount cannot be negative");
        tf80.m188655b(i <= i2, "start should be <= than end");
        if (charSequence == null) {
            return charSequence;
        }
        tf80.m188655b(i <= charSequence.length(), "start should be < than charSequence length");
        tf80.m188655b(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        if (i4 != 1) {
            z = i4 != 2 ? this.f93632g : false;
        } else {
            z = true;
        }
        return this.f93630e.mo118651c(charSequence, i, i2, i3, z);
    }

    /* JADX INFO: renamed from: q */
    public void m118647q(@NonNull AbstractC16712d abstractC16712d) {
        tf80.m188659f(abstractC16712d, "initCallback cannot be null");
        this.f93626a.writeLock().lock();
        try {
            int i = this.f93628c;
            if (i == 1 || i == 2) {
                this.f93629d.post(new RunnableC16713e(abstractC16712d, i));
            } else {
                this.f93627b.add(abstractC16712d);
            }
        } finally {
            this.f93626a.writeLock().unlock();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: r */
    public void m118648r(@NonNull EditorInfo editorInfo) {
        if (!m118639i() || editorInfo == null || editorInfo.extras == null) {
            return;
        }
        this.f93630e.mo118652d(editorInfo);
    }

    /* JADX INFO: renamed from: l.exe$d */
    public static abstract class AbstractC16712d {
        /* JADX INFO: renamed from: b */
        public void mo118660b() {
        }

        /* JADX INFO: renamed from: a */
        public void m118659a(@Nullable Throwable th) {
        }
    }

    /* JADX INFO: renamed from: l.exe$e */
    public static class RunnableC16713e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final List<AbstractC16712d> f93650a;

        /* JADX INFO: renamed from: b */
        public final Throwable f93651b;

        /* JADX INFO: renamed from: c */
        public final int f93652c;

        public RunnableC16713e(@NonNull AbstractC16712d abstractC16712d, int i) {
            this(Arrays.asList((AbstractC16712d) tf80.m188659f(abstractC16712d, "initCallback cannot be null")), i, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f93650a.size();
            int i = 0;
            if (this.f93652c != 1) {
                while (i < size) {
                    this.f93650a.get(i).m118659a(this.f93651b);
                    i++;
                }
            } else {
                while (i < size) {
                    this.f93650a.get(i).mo118660b();
                    i++;
                }
            }
        }

        public RunnableC16713e(@NonNull Collection<AbstractC16712d> collection, int i) {
            this(collection, i, null);
        }

        public RunnableC16713e(@NonNull Collection<AbstractC16712d> collection, int i, @Nullable Throwable th) {
            tf80.m188659f(collection, "initCallbacks cannot be null");
            this.f93650a = new ArrayList(collection);
            this.f93652c = i;
            this.f93651b = th;
        }
    }
}
