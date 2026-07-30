package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class qb1 extends pb1 {

    /* JADX INFO: renamed from: b */
    public volatile bkj0<String, AudioBusinessType, ga1> f156448b;

    /* JADX INFO: renamed from: c */
    public final Deque<bkj0<String, AudioBusinessType, WeakReference<ga1>>> f156449c = new LinkedList();

    @Override // p153l.pb1
    /* JADX INFO: renamed from: a */
    public void mo171473a(String str) {
        if (this.f156448b != null && TextUtils.equals(this.f156448b.f77081a, str)) {
            this.f156448b = null;
        }
        if (this.f156449c.size() <= 0) {
            return;
        }
        bkj0<String, AudioBusinessType, WeakReference<ga1>> bkj0VarPop = this.f156449c.pop();
        if (!NullChecker.m82486a(bkj0VarPop) || !TextUtils.equals(bkj0VarPop.f77081a, str)) {
            ga1 ga1Var = bkj0VarPop.f77083c.get();
            if (NullChecker.m82486a(ga1Var)) {
                ga1Var.mo62651c(bkj0VarPop.f77081a, bkj0VarPop.f77082b, str, ga1Var);
            }
            this.f156449c.clear();
            String str2 = bkj0VarPop.f77081a;
            Objects.toString(bkj0VarPop.f77082b);
            Objects.toString(bkj0VarPop.f77083c);
            return;
        }
        while (true) {
            int size = this.f156449c.size();
            Deque<bkj0<String, AudioBusinessType, WeakReference<ga1>>> deque = this.f156449c;
            if (size <= 0) {
                deque.clear();
                return;
            } else {
                ga1 ga1Var2 = deque.pop().f77083c.get();
                if (NullChecker.m82486a(ga1Var2)) {
                    ga1Var2.mo129685a(bkj0VarPop.f77081a, bkj0VarPop.f77082b, ga1Var2);
                }
            }
        }
    }

    @Override // p153l.pb1
    /* JADX INFO: renamed from: c */
    public AudioBusinessType mo171474c() {
        if (NullChecker.m82486a(this.f156448b) && this.f156448b.f77082b != AudioBusinessType.NORMAL) {
            return this.f156448b.f77082b;
        }
        if (NullChecker.m82486a(this.f156448b)) {
            this.f156448b.f77083c.mo40108b(this.f156448b.f77082b, null, null);
        }
        return null;
    }

    @Override // p153l.pb1
    /* JADX INFO: renamed from: d */
    public boolean mo171475d(AudioBusinessType audioBusinessType) {
        return audioBusinessType != AudioBusinessType.NORMAL;
    }

    @Override // p153l.pb1
    /* JADX INFO: renamed from: e */
    public void mo171476e(String str) {
        if (this.f156448b != null && TextUtils.equals(this.f156448b.f77081a, str)) {
            this.f156448b = null;
        }
        bkj0<String, AudioBusinessType, WeakReference<ga1>> bkj0VarM176007h = m176007h(str);
        if (bkj0VarM176007h != null) {
            this.f156449c.remove(bkj0VarM176007h);
        }
    }

    @Override // p153l.pb1
    /* JADX INFO: renamed from: f */
    public void mo171477f(String str, AudioBusinessType audioBusinessType, ga1 ga1Var) {
        if (this.f156448b == null || TextUtils.equals(str, this.f156448b.f77081a)) {
            this.f156448b = new bkj0<>(str, audioBusinessType, ga1Var);
            ga1Var.success();
            return;
        }
        if (audioBusinessType == AudioBusinessType.VIDEO_CHAT) {
            this.f156448b.f77083c.mo40108b(this.f156448b.f77082b, str, audioBusinessType);
            this.f156448b = new bkj0<>(str, audioBusinessType, ga1Var);
            ga1Var.success();
        } else if (audioBusinessType == AudioBusinessType.LIVE_IN_ROOM) {
            this.f156448b.f77083c.mo40108b(this.f156448b.f77082b, str, audioBusinessType);
            this.f156448b = new bkj0<>(str, audioBusinessType, ga1Var);
            ga1Var.success();
        } else if (!mo171475d(audioBusinessType) && !mo171475d(this.f156448b.f77082b) && audioBusinessType != this.f156448b.f77082b) {
            this.f156448b = new bkj0<>(str, audioBusinessType, ga1Var);
            ga1Var.success();
        } else {
            String str2 = this.f156448b.f77081a;
            Objects.toString(this.f156448b.f77082b);
            ga1Var.mo40109d(str, audioBusinessType, ga1Var, this.f156448b.f77081a, this.f156448b.f77082b);
        }
    }

    @Override // p153l.pb1
    /* JADX INFO: renamed from: g */
    public void mo171478g(String str, AudioBusinessType audioBusinessType, ga1 ga1Var) {
        Objects.toString(audioBusinessType);
        Objects.toString(ga1Var);
        if (this.f156448b != null && !TextUtils.equals(str, this.f156448b.f77081a)) {
            this.f156449c.push(new bkj0<>(this.f156448b.f77081a, this.f156448b.f77082b, new WeakReference(this.f156448b.f77083c)));
            if (this.f156448b != null) {
                this.f156448b.f77083c.mo40108b(this.f156448b.f77082b, str, audioBusinessType);
            }
        }
        this.f156448b = new bkj0<>(str, audioBusinessType, ga1Var);
    }

    /* JADX INFO: renamed from: h */
    public bkj0<String, AudioBusinessType, WeakReference<ga1>> m176007h(String str) {
        if (this.f156449c.size() == 0) {
            return null;
        }
        for (bkj0<String, AudioBusinessType, WeakReference<ga1>> bkj0Var : this.f156449c) {
            if (TextUtils.equals(str, bkj0Var.f77081a)) {
                return bkj0Var;
            }
        }
        return null;
    }
}
