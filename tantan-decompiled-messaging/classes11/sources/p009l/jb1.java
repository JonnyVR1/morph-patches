package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final class jb1 extends ib1 {

    /* JADX INFO: renamed from: b */
    public volatile xaj0<String, AudioBusinessType, z91> f15036b;

    /* JADX INFO: renamed from: c */
    public final Deque<xaj0<String, AudioBusinessType, WeakReference<z91>>> f15037c = new LinkedList();

    @Override // p009l.ib1
    /* JADX INFO: renamed from: a */
    public void mo16308a(String str) {
        if (this.f15036b != null && TextUtils.equals((CharSequence) this.f15036b.a, str)) {
            this.f15036b = null;
        }
        if (this.f15037c.size() <= 0) {
            return;
        }
        xaj0<String, AudioBusinessType, WeakReference<z91>> xaj0VarPop = this.f15037c.pop();
        if (!NullChecker.a(xaj0VarPop) || !TextUtils.equals((CharSequence) xaj0VarPop.a, str)) {
            z91 z91Var = (z91) ((WeakReference) xaj0VarPop.c).get();
            if (NullChecker.a(z91Var)) {
                z91Var.m25626c((String) xaj0VarPop.a, (AudioBusinessType) xaj0VarPop.b, str, z91Var);
            }
            this.f15037c.clear();
            Objects.toString(xaj0VarPop.b);
            Objects.toString(xaj0VarPop.c);
            return;
        }
        while (true) {
            int size = this.f15037c.size();
            Deque<xaj0<String, AudioBusinessType, WeakReference<z91>>> deque = this.f15037c;
            if (size <= 0) {
                deque.clear();
                return;
            } else {
                z91 z91Var2 = (z91) ((WeakReference) deque.pop().c).get();
                if (NullChecker.a(z91Var2)) {
                    z91Var2.m25625a((String) xaj0VarPop.a, (AudioBusinessType) xaj0VarPop.b, z91Var2);
                }
            }
        }
    }

    @Override // p009l.ib1
    /* JADX INFO: renamed from: c */
    public AudioBusinessType mo16309c() {
        if (NullChecker.a(this.f15036b) && this.f15036b.b != AudioBusinessType.NORMAL) {
            return (AudioBusinessType) this.f15036b.b;
        }
        if (NullChecker.a(this.f15036b)) {
            ((z91) this.f15036b.c).mo3116b((AudioBusinessType) this.f15036b.b, null, null);
        }
        return null;
    }

    @Override // p009l.ib1
    /* JADX INFO: renamed from: d */
    public boolean mo16310d(AudioBusinessType audioBusinessType) {
        return audioBusinessType != AudioBusinessType.NORMAL;
    }

    @Override // p009l.ib1
    /* JADX INFO: renamed from: e */
    public void mo16311e(String str) {
        if (this.f15036b != null && TextUtils.equals((CharSequence) this.f15036b.a, str)) {
            this.f15036b = null;
        }
        xaj0<String, AudioBusinessType, WeakReference<z91>> xaj0VarM16933h = m16933h(str);
        if (xaj0VarM16933h != null) {
            this.f15037c.remove(xaj0VarM16933h);
        }
    }

    @Override // p009l.ib1
    /* JADX INFO: renamed from: f */
    public void mo16312f(String str, AudioBusinessType audioBusinessType, z91 z91Var) {
        if (this.f15036b == null || TextUtils.equals(str, (CharSequence) this.f15036b.a)) {
            this.f15036b = new xaj0<>(str, audioBusinessType, z91Var);
            z91Var.success();
            return;
        }
        if (audioBusinessType == AudioBusinessType.VIDEO_CHAT) {
            ((z91) this.f15036b.c).mo3116b((AudioBusinessType) this.f15036b.b, str, audioBusinessType);
            this.f15036b = new xaj0<>(str, audioBusinessType, z91Var);
            z91Var.success();
        } else if (audioBusinessType == AudioBusinessType.LIVE_IN_ROOM) {
            ((z91) this.f15036b.c).mo3116b((AudioBusinessType) this.f15036b.b, str, audioBusinessType);
            this.f15036b = new xaj0<>(str, audioBusinessType, z91Var);
            z91Var.success();
        } else if (!mo16310d(audioBusinessType) && !mo16310d((AudioBusinessType) this.f15036b.b) && audioBusinessType != this.f15036b.b) {
            this.f15036b = new xaj0<>(str, audioBusinessType, z91Var);
            z91Var.success();
        } else {
            Objects.toString(this.f15036b.b);
            z91Var.mo3117d(str, audioBusinessType, z91Var, (String) this.f15036b.a, (AudioBusinessType) this.f15036b.b);
        }
    }

    @Override // p009l.ib1
    /* JADX INFO: renamed from: g */
    public void mo16313g(String str, AudioBusinessType audioBusinessType, z91 z91Var) {
        Objects.toString(audioBusinessType);
        Objects.toString(z91Var);
        if (this.f15036b != null && !TextUtils.equals(str, (CharSequence) this.f15036b.a)) {
            this.f15037c.push(new xaj0<>((String) this.f15036b.a, (AudioBusinessType) this.f15036b.b, new WeakReference((z91) this.f15036b.c)));
            if (this.f15036b != null) {
                ((z91) this.f15036b.c).mo3116b((AudioBusinessType) this.f15036b.b, str, audioBusinessType);
            }
        }
        this.f15036b = new xaj0<>(str, audioBusinessType, z91Var);
    }

    /* JADX INFO: renamed from: h */
    public xaj0<String, AudioBusinessType, WeakReference<z91>> m16933h(String str) {
        if (this.f15037c.size() == 0) {
            return null;
        }
        for (xaj0<String, AudioBusinessType, WeakReference<z91>> xaj0Var : this.f15037c) {
            if (TextUtils.equals(str, (CharSequence) xaj0Var.a)) {
                return xaj0Var;
            }
        }
        return null;
    }
}
