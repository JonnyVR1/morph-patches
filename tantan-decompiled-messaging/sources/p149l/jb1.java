package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class jb1 extends ib1 {

    /* JADX INFO: renamed from: b */
    public volatile xaj0<String, AudioBusinessType, z91> f117151b;

    /* JADX INFO: renamed from: c */
    public final Deque<xaj0<String, AudioBusinessType, WeakReference<z91>>> f117152c = new LinkedList();

    @Override // p149l.ib1
    /* JADX INFO: renamed from: a */
    public void mo135234a(String str) {
        if (this.f117151b != null && TextUtils.equals(this.f117151b.f191751a, str)) {
            this.f117151b = null;
        }
        if (this.f117152c.size() <= 0) {
            return;
        }
        xaj0<String, AudioBusinessType, WeakReference<z91>> xaj0VarPop = this.f117152c.pop();
        if (!NullChecker.m81303a(xaj0VarPop) || !TextUtils.equals(xaj0VarPop.f191751a, str)) {
            z91 z91Var = xaj0VarPop.f191753c.get();
            if (NullChecker.m81303a(z91Var)) {
                z91Var.mo61467c(xaj0VarPop.f191751a, xaj0VarPop.f191752b, str, z91Var);
            }
            this.f117152c.clear();
            String str2 = xaj0VarPop.f191751a;
            Objects.toString(xaj0VarPop.f191752b);
            Objects.toString(xaj0VarPop.f191753c);
            return;
        }
        while (true) {
            int size = this.f117152c.size();
            Deque<xaj0<String, AudioBusinessType, WeakReference<z91>>> deque = this.f117152c;
            if (size <= 0) {
                deque.clear();
                return;
            } else {
                z91 z91Var2 = deque.pop().f191753c.get();
                if (NullChecker.m81303a(z91Var2)) {
                    z91Var2.mo143340a(xaj0VarPop.f191751a, xaj0VarPop.f191752b, z91Var2);
                }
            }
        }
    }

    @Override // p149l.ib1
    /* JADX INFO: renamed from: c */
    public AudioBusinessType mo135235c() {
        if (NullChecker.m81303a(this.f117151b) && this.f117151b.f191752b != AudioBusinessType.NORMAL) {
            return this.f117151b.f191752b;
        }
        if (NullChecker.m81303a(this.f117151b)) {
            this.f117151b.f191753c.mo39105b(this.f117151b.f191752b, null, null);
        }
        return null;
    }

    @Override // p149l.ib1
    /* JADX INFO: renamed from: d */
    public boolean mo135236d(AudioBusinessType audioBusinessType) {
        return audioBusinessType != AudioBusinessType.NORMAL;
    }

    @Override // p149l.ib1
    /* JADX INFO: renamed from: e */
    public void mo135237e(String str) {
        if (this.f117151b != null && TextUtils.equals(this.f117151b.f191751a, str)) {
            this.f117151b = null;
        }
        xaj0<String, AudioBusinessType, WeakReference<z91>> xaj0VarM140734h = m140734h(str);
        if (xaj0VarM140734h != null) {
            this.f117152c.remove(xaj0VarM140734h);
        }
    }

    @Override // p149l.ib1
    /* JADX INFO: renamed from: f */
    public void mo135238f(String str, AudioBusinessType audioBusinessType, z91 z91Var) {
        if (this.f117151b == null || TextUtils.equals(str, this.f117151b.f191751a)) {
            this.f117151b = new xaj0<>(str, audioBusinessType, z91Var);
            z91Var.success();
            return;
        }
        if (audioBusinessType == AudioBusinessType.VIDEO_CHAT) {
            this.f117151b.f191753c.mo39105b(this.f117151b.f191752b, str, audioBusinessType);
            this.f117151b = new xaj0<>(str, audioBusinessType, z91Var);
            z91Var.success();
        } else if (audioBusinessType == AudioBusinessType.LIVE_IN_ROOM) {
            this.f117151b.f191753c.mo39105b(this.f117151b.f191752b, str, audioBusinessType);
            this.f117151b = new xaj0<>(str, audioBusinessType, z91Var);
            z91Var.success();
        } else if (!mo135236d(audioBusinessType) && !mo135236d(this.f117151b.f191752b) && audioBusinessType != this.f117151b.f191752b) {
            this.f117151b = new xaj0<>(str, audioBusinessType, z91Var);
            z91Var.success();
        } else {
            String str2 = this.f117151b.f191751a;
            Objects.toString(this.f117151b.f191752b);
            z91Var.mo39106d(str, audioBusinessType, z91Var, this.f117151b.f191751a, this.f117151b.f191752b);
        }
    }

    @Override // p149l.ib1
    /* JADX INFO: renamed from: g */
    public void mo135239g(String str, AudioBusinessType audioBusinessType, z91 z91Var) {
        Objects.toString(audioBusinessType);
        Objects.toString(z91Var);
        if (this.f117151b != null && !TextUtils.equals(str, this.f117151b.f191751a)) {
            this.f117152c.push(new xaj0<>(this.f117151b.f191751a, this.f117151b.f191752b, new WeakReference(this.f117151b.f191753c)));
            if (this.f117151b != null) {
                this.f117151b.f191753c.mo39105b(this.f117151b.f191752b, str, audioBusinessType);
            }
        }
        this.f117151b = new xaj0<>(str, audioBusinessType, z91Var);
    }

    /* JADX INFO: renamed from: h */
    public xaj0<String, AudioBusinessType, WeakReference<z91>> m140734h(String str) {
        if (this.f117152c.size() == 0) {
            return null;
        }
        for (xaj0<String, AudioBusinessType, WeakReference<z91>> xaj0Var : this.f117152c) {
            if (TextUtils.equals(str, xaj0Var.f191751a)) {
                return xaj0Var;
            }
        }
        return null;
    }
}
