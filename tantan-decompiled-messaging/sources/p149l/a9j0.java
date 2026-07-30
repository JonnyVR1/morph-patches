package p149l;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class a9j0 extends u7j0 {

    /* JADX INFO: renamed from: c */
    public int f68182c;

    /* JADX INFO: renamed from: a */
    public ArrayList<u7j0> f68180a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public boolean f68181b = true;

    /* JADX INFO: renamed from: d */
    public boolean f68183d = false;

    /* JADX INFO: renamed from: e */
    public int f68184e = 0;

    /* JADX INFO: renamed from: l.a9j0$a */
    public class C15549a extends u8j0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ u7j0 f68185a;

        public C15549a(u7j0 u7j0Var) {
            this.f68185a = u7j0Var;
        }

        @Override // p149l.u8j0, p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: c */
        public void mo95445c(@NonNull u7j0 u7j0Var) {
            this.f68185a.runAnimators();
            u7j0Var.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: l.a9j0$b */
    public static class C15550b extends u8j0 {

        /* JADX INFO: renamed from: a */
        public a9j0 f68187a;

        public C15550b(a9j0 a9j0Var) {
            this.f68187a = a9j0Var;
        }

        @Override // p149l.u8j0, p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: a */
        public void mo95446a(@NonNull u7j0 u7j0Var) {
            a9j0 a9j0Var = this.f68187a;
            if (a9j0Var.f68183d) {
                return;
            }
            a9j0Var.start();
            this.f68187a.f68183d = true;
        }

        @Override // p149l.u8j0, p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: c */
        public void mo95445c(@NonNull u7j0 u7j0Var) {
            a9j0 a9j0Var = this.f68187a;
            int i = a9j0Var.f68182c - 1;
            a9j0Var.f68182c = i;
            if (i == 0) {
                a9j0Var.f68183d = false;
                a9j0Var.end();
            }
            u7j0Var.removeListener(this);
        }
    }

    @Override // p149l.u7j0
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a9j0 addListener(@NonNull u7j0.InterfaceC20375g interfaceC20375g) {
        return (a9j0) super.addListener(interfaceC20375g);
    }

    @Override // p149l.u7j0
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a9j0 addTarget(@IdRes int i) {
        for (int i2 = 0; i2 < this.f68180a.size(); i2++) {
            this.f68180a.get(i2).addTarget(i);
        }
        return (a9j0) super.addTarget(i);
    }

    @Override // p149l.u7j0
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a9j0 addTarget(@NonNull View view) {
        for (int i = 0; i < this.f68180a.size(); i++) {
            this.f68180a.get(i).addTarget(view);
        }
        return (a9j0) super.addTarget(view);
    }

    @Override // p149l.u7j0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        super.cancel();
        int size = this.f68180a.size();
        for (int i = 0; i < size; i++) {
            this.f68180a.get(i).cancel();
        }
    }

    @Override // p149l.u7j0
    public void captureEndValues(@NonNull g9j0 g9j0Var) {
        if (isValidTarget(g9j0Var.f101571b)) {
            for (u7j0 u7j0Var : this.f68180a) {
                if (u7j0Var.isValidTarget(g9j0Var.f101571b)) {
                    u7j0Var.captureEndValues(g9j0Var);
                    g9j0Var.f101572c.add(u7j0Var);
                }
            }
        }
    }

    @Override // p149l.u7j0
    public void capturePropagationValues(g9j0 g9j0Var) {
        super.capturePropagationValues(g9j0Var);
        int size = this.f68180a.size();
        for (int i = 0; i < size; i++) {
            this.f68180a.get(i).capturePropagationValues(g9j0Var);
        }
    }

    @Override // p149l.u7j0
    public void captureStartValues(@NonNull g9j0 g9j0Var) {
        if (isValidTarget(g9j0Var.f101571b)) {
            for (u7j0 u7j0Var : this.f68180a) {
                if (u7j0Var.isValidTarget(g9j0Var.f101571b)) {
                    u7j0Var.captureStartValues(g9j0Var);
                    g9j0Var.f101572c.add(u7j0Var);
                }
            }
        }
    }

    @Override // p149l.u7j0
    public u7j0 clone() {
        a9j0 a9j0Var = (a9j0) super.clone();
        a9j0Var.f68180a = new ArrayList<>();
        int size = this.f68180a.size();
        for (int i = 0; i < size; i++) {
            a9j0Var.m95431j(this.f68180a.get(i).clone());
        }
        return a9j0Var;
    }

    @Override // p149l.u7j0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void createAnimators(ViewGroup viewGroup, h9j0 h9j0Var, h9j0 h9j0Var2, ArrayList<g9j0> arrayList, ArrayList<g9j0> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f68180a.size();
        for (int i = 0; i < size; i++) {
            u7j0 u7j0Var = this.f68180a.get(i);
            if (startDelay > 0 && (this.f68181b || i == 0)) {
                long startDelay2 = u7j0Var.getStartDelay();
                if (startDelay2 > 0) {
                    u7j0Var.setStartDelay(startDelay2 + startDelay);
                } else {
                    u7j0Var.setStartDelay(startDelay);
                }
            }
            u7j0Var.createAnimators(viewGroup, h9j0Var, h9j0Var2, arrayList, arrayList2);
        }
    }

    @Override // p149l.u7j0
    @NonNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public a9j0 addTarget(@NonNull Class<?> cls) {
        for (int i = 0; i < this.f68180a.size(); i++) {
            this.f68180a.get(i).addTarget(cls);
        }
        return (a9j0) super.addTarget(cls);
    }

    @Override // p149l.u7j0
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a9j0 addTarget(@NonNull String str) {
        for (int i = 0; i < this.f68180a.size(); i++) {
            this.f68180a.get(i).addTarget(str);
        }
        return (a9j0) super.addTarget(str);
    }

    @Override // p149l.u7j0
    @NonNull
    public u7j0 excludeTarget(@NonNull View view, boolean z) {
        for (int i = 0; i < this.f68180a.size(); i++) {
            this.f68180a.get(i).excludeTarget(view, z);
        }
        return super.excludeTarget(view, z);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public a9j0 m95430f(@NonNull u7j0 u7j0Var) {
        m95431j(u7j0Var);
        long j = this.mDuration;
        if (j >= 0) {
            u7j0Var.setDuration(j);
        }
        if ((this.f68184e & 1) != 0) {
            u7j0Var.setInterpolator(getInterpolator());
        }
        if ((this.f68184e & 2) != 0) {
            u7j0Var.setPropagation(getPropagation());
        }
        if ((this.f68184e & 4) != 0) {
            u7j0Var.setPathMotion(getPathMotion());
        }
        if ((this.f68184e & 8) != 0) {
            u7j0Var.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    @Override // p149l.u7j0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f68180a.size();
        for (int i = 0; i < size; i++) {
            this.f68180a.get(i).forceToEnd(viewGroup);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m95431j(@NonNull u7j0 u7j0Var) {
        this.f68180a.add(u7j0Var);
        u7j0Var.mParent = this;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public u7j0 m95432k(int i) {
        if (i < 0 || i >= this.f68180a.size()) {
            return null;
        }
        return this.f68180a.get(i);
    }

    /* JADX INFO: renamed from: l */
    public int m95433l() {
        return this.f68180a.size();
    }

    @Override // p149l.u7j0
    @NonNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a9j0 removeListener(@NonNull u7j0.InterfaceC20375g interfaceC20375g) {
        return (a9j0) super.removeListener(interfaceC20375g);
    }

    @Override // p149l.u7j0
    @NonNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public a9j0 removeTarget(@IdRes int i) {
        for (int i2 = 0; i2 < this.f68180a.size(); i2++) {
            this.f68180a.get(i2).removeTarget(i);
        }
        return (a9j0) super.removeTarget(i);
    }

    @Override // p149l.u7j0
    @NonNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public a9j0 removeTarget(@NonNull View view) {
        for (int i = 0; i < this.f68180a.size(); i++) {
            this.f68180a.get(i).removeTarget(view);
        }
        return (a9j0) super.removeTarget(view);
    }

    @Override // p149l.u7j0
    @NonNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public a9j0 removeTarget(@NonNull Class<?> cls) {
        for (int i = 0; i < this.f68180a.size(); i++) {
            this.f68180a.get(i).removeTarget(cls);
        }
        return (a9j0) super.removeTarget(cls);
    }

    @Override // p149l.u7j0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void pause(View view) {
        super.pause(view);
        int size = this.f68180a.size();
        for (int i = 0; i < size; i++) {
            this.f68180a.get(i).pause(view);
        }
    }

    @Override // p149l.u7j0
    @NonNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public a9j0 removeTarget(@NonNull String str) {
        for (int i = 0; i < this.f68180a.size(); i++) {
            this.f68180a.get(i).removeTarget(str);
        }
        return (a9j0) super.removeTarget(str);
    }

    @Override // p149l.u7j0
    @NonNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public a9j0 setDuration(long j) {
        ArrayList<u7j0> arrayList;
        super.setDuration(j);
        if (this.mDuration >= 0 && (arrayList = this.f68180a) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f68180a.get(i).setDuration(j);
            }
        }
        return this;
    }

    @Override // p149l.u7j0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void resume(View view) {
        super.resume(view);
        int size = this.f68180a.size();
        for (int i = 0; i < size; i++) {
            this.f68180a.get(i).resume(view);
        }
    }

    @Override // p149l.u7j0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        ArrayList<u7j0> arrayList;
        if (this.f68180a.isEmpty()) {
            start();
            end();
            return;
        }
        m95444w();
        if (this.f68181b) {
            Iterator<u7j0> it = this.f68180a.iterator();
            while (it.hasNext()) {
                it.next().runAnimators();
            }
            return;
        }
        int i = 1;
        while (true) {
            int size = this.f68180a.size();
            arrayList = this.f68180a;
            if (i >= size) {
                break;
            }
            arrayList.get(i - 1).addListener(new C15549a(this.f68180a.get(i)));
            i++;
        }
        u7j0 u7j0Var = arrayList.get(0);
        if (u7j0Var != null) {
            u7j0Var.runAnimators();
        }
    }

    @Override // p149l.u7j0
    @NonNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public a9j0 setInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.f68184e |= 1;
        ArrayList<u7j0> arrayList = this.f68180a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f68180a.get(i).setInterpolator(timeInterpolator);
            }
        }
        return (a9j0) super.setInterpolator(timeInterpolator);
    }

    @Override // p149l.u7j0
    public void setCanRemoveViews(boolean z) {
        super.setCanRemoveViews(z);
        int size = this.f68180a.size();
        for (int i = 0; i < size; i++) {
            this.f68180a.get(i).setCanRemoveViews(z);
        }
    }

    @Override // p149l.u7j0
    public void setEpicenterCallback(u7j0.AbstractC20374f abstractC20374f) {
        super.setEpicenterCallback(abstractC20374f);
        this.f68184e |= 8;
        int size = this.f68180a.size();
        for (int i = 0; i < size; i++) {
            this.f68180a.get(i).setEpicenterCallback(abstractC20374f);
        }
    }

    @Override // p149l.u7j0
    public void setPathMotion(va60 va60Var) {
        super.setPathMotion(va60Var);
        this.f68184e |= 4;
        if (this.f68180a != null) {
            for (int i = 0; i < this.f68180a.size(); i++) {
                this.f68180a.get(i).setPathMotion(va60Var);
            }
        }
    }

    @Override // p149l.u7j0
    public void setPropagation(x8j0 x8j0Var) {
        super.setPropagation(x8j0Var);
        this.f68184e |= 2;
        int size = this.f68180a.size();
        for (int i = 0; i < size; i++) {
            this.f68180a.get(i).setPropagation(x8j0Var);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public a9j0 m95441t(int i) {
        if (i == 0) {
            this.f68181b = true;
            return this;
        }
        if (i == 1) {
            this.f68181b = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
    }

    @Override // p149l.u7j0
    public String toString(String str) {
        String string = super.toString(str);
        for (int i = 0; i < this.f68180a.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(SignParameters.NEW_LINE);
            sb.append(this.f68180a.get(i).toString(str + "  "));
            string = sb.toString();
        }
        return string;
    }

    @Override // p149l.u7j0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public a9j0 setSceneRoot(ViewGroup viewGroup) {
        super.setSceneRoot(viewGroup);
        int size = this.f68180a.size();
        for (int i = 0; i < size; i++) {
            this.f68180a.get(i).setSceneRoot(viewGroup);
        }
        return this;
    }

    @Override // p149l.u7j0
    @NonNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public a9j0 setStartDelay(long j) {
        return (a9j0) super.setStartDelay(j);
    }

    /* JADX INFO: renamed from: w */
    public final void m95444w() {
        C15550b c15550b = new C15550b(this);
        Iterator<u7j0> it = this.f68180a.iterator();
        while (it.hasNext()) {
            it.next().addListener(c15550b);
        }
        this.f68182c = this.f68180a.size();
    }

    @Override // p149l.u7j0
    @NonNull
    public u7j0 excludeTarget(@NonNull String str, boolean z) {
        for (int i = 0; i < this.f68180a.size(); i++) {
            this.f68180a.get(i).excludeTarget(str, z);
        }
        return super.excludeTarget(str, z);
    }

    @Override // p149l.u7j0
    @NonNull
    public u7j0 excludeTarget(int i, boolean z) {
        for (int i2 = 0; i2 < this.f68180a.size(); i2++) {
            this.f68180a.get(i2).excludeTarget(i, z);
        }
        return super.excludeTarget(i, z);
    }

    @Override // p149l.u7j0
    @NonNull
    public u7j0 excludeTarget(@NonNull Class<?> cls, boolean z) {
        for (int i = 0; i < this.f68180a.size(); i++) {
            this.f68180a.get(i).excludeTarget(cls, z);
        }
        return super.excludeTarget(cls, z);
    }
}
