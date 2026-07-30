package p153l;

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
public class eij0 extends ygj0 {

    /* JADX INFO: renamed from: c */
    public int f94161c;

    /* JADX INFO: renamed from: a */
    public ArrayList<ygj0> f94159a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public boolean f94160b = true;

    /* JADX INFO: renamed from: d */
    public boolean f94162d = false;

    /* JADX INFO: renamed from: e */
    public int f94163e = 0;

    /* JADX INFO: renamed from: l.eij0$a */
    public class C16777a extends yhj0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ygj0 f94164a;

        public C16777a(ygj0 ygj0Var) {
            this.f94164a = ygj0Var;
        }

        @Override // p153l.yhj0, p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: c */
        public void mo106211c(@NonNull ygj0 ygj0Var) {
            this.f94164a.runAnimators();
            ygj0Var.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: l.eij0$b */
    public static class C16778b extends yhj0 {

        /* JADX INFO: renamed from: a */
        public eij0 f94166a;

        public C16778b(eij0 eij0Var) {
            this.f94166a = eij0Var;
        }

        @Override // p153l.yhj0, p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: a */
        public void mo120913a(@NonNull ygj0 ygj0Var) {
            eij0 eij0Var = this.f94166a;
            if (eij0Var.f94162d) {
                return;
            }
            eij0Var.start();
            this.f94166a.f94162d = true;
        }

        @Override // p153l.yhj0, p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: c */
        public void mo106211c(@NonNull ygj0 ygj0Var) {
            eij0 eij0Var = this.f94166a;
            int i = eij0Var.f94161c - 1;
            eij0Var.f94161c = i;
            if (i == 0) {
                eij0Var.f94162d = false;
                eij0Var.end();
            }
            ygj0Var.removeListener(this);
        }
    }

    @Override // p153l.ygj0
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public eij0 addListener(@NonNull ygj0.InterfaceC21593g interfaceC21593g) {
        return (eij0) super.addListener(interfaceC21593g);
    }

    @Override // p153l.ygj0
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public eij0 addTarget(@IdRes int i) {
        for (int i2 = 0; i2 < this.f94159a.size(); i2++) {
            this.f94159a.get(i2).addTarget(i);
        }
        return (eij0) super.addTarget(i);
    }

    @Override // p153l.ygj0
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public eij0 addTarget(@NonNull View view) {
        for (int i = 0; i < this.f94159a.size(); i++) {
            this.f94159a.get(i).addTarget(view);
        }
        return (eij0) super.addTarget(view);
    }

    @Override // p153l.ygj0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        super.cancel();
        int size = this.f94159a.size();
        for (int i = 0; i < size; i++) {
            this.f94159a.get(i).cancel();
        }
    }

    @Override // p153l.ygj0
    public void captureEndValues(@NonNull kij0 kij0Var) {
        if (isValidTarget(kij0Var.f127001b)) {
            for (ygj0 ygj0Var : this.f94159a) {
                if (ygj0Var.isValidTarget(kij0Var.f127001b)) {
                    ygj0Var.captureEndValues(kij0Var);
                    kij0Var.f127002c.add(ygj0Var);
                }
            }
        }
    }

    @Override // p153l.ygj0
    public void capturePropagationValues(kij0 kij0Var) {
        super.capturePropagationValues(kij0Var);
        int size = this.f94159a.size();
        for (int i = 0; i < size; i++) {
            this.f94159a.get(i).capturePropagationValues(kij0Var);
        }
    }

    @Override // p153l.ygj0
    public void captureStartValues(@NonNull kij0 kij0Var) {
        if (isValidTarget(kij0Var.f127001b)) {
            for (ygj0 ygj0Var : this.f94159a) {
                if (ygj0Var.isValidTarget(kij0Var.f127001b)) {
                    ygj0Var.captureStartValues(kij0Var);
                    kij0Var.f127002c.add(ygj0Var);
                }
            }
        }
    }

    @Override // p153l.ygj0
    public ygj0 clone() {
        eij0 eij0Var = (eij0) super.clone();
        eij0Var.f94159a = new ArrayList<>();
        int size = this.f94159a.size();
        for (int i = 0; i < size; i++) {
            eij0Var.m120899j(this.f94159a.get(i).clone());
        }
        return eij0Var;
    }

    @Override // p153l.ygj0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void createAnimators(ViewGroup viewGroup, lij0 lij0Var, lij0 lij0Var2, ArrayList<kij0> arrayList, ArrayList<kij0> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f94159a.size();
        for (int i = 0; i < size; i++) {
            ygj0 ygj0Var = this.f94159a.get(i);
            if (startDelay > 0 && (this.f94160b || i == 0)) {
                long startDelay2 = ygj0Var.getStartDelay();
                if (startDelay2 > 0) {
                    ygj0Var.setStartDelay(startDelay2 + startDelay);
                } else {
                    ygj0Var.setStartDelay(startDelay);
                }
            }
            ygj0Var.createAnimators(viewGroup, lij0Var, lij0Var2, arrayList, arrayList2);
        }
    }

    @Override // p153l.ygj0
    @NonNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public eij0 addTarget(@NonNull Class<?> cls) {
        for (int i = 0; i < this.f94159a.size(); i++) {
            this.f94159a.get(i).addTarget(cls);
        }
        return (eij0) super.addTarget(cls);
    }

    @Override // p153l.ygj0
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public eij0 addTarget(@NonNull String str) {
        for (int i = 0; i < this.f94159a.size(); i++) {
            this.f94159a.get(i).addTarget(str);
        }
        return (eij0) super.addTarget(str);
    }

    @Override // p153l.ygj0
    @NonNull
    public ygj0 excludeTarget(@NonNull View view, boolean z) {
        for (int i = 0; i < this.f94159a.size(); i++) {
            this.f94159a.get(i).excludeTarget(view, z);
        }
        return super.excludeTarget(view, z);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public eij0 m120898f(@NonNull ygj0 ygj0Var) {
        m120899j(ygj0Var);
        long j = this.mDuration;
        if (j >= 0) {
            ygj0Var.setDuration(j);
        }
        if ((this.f94163e & 1) != 0) {
            ygj0Var.setInterpolator(getInterpolator());
        }
        if ((this.f94163e & 2) != 0) {
            ygj0Var.setPropagation(getPropagation());
        }
        if ((this.f94163e & 4) != 0) {
            ygj0Var.setPathMotion(getPathMotion());
        }
        if ((this.f94163e & 8) != 0) {
            ygj0Var.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    @Override // p153l.ygj0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f94159a.size();
        for (int i = 0; i < size; i++) {
            this.f94159a.get(i).forceToEnd(viewGroup);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m120899j(@NonNull ygj0 ygj0Var) {
        this.f94159a.add(ygj0Var);
        ygj0Var.mParent = this;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public ygj0 m120900k(int i) {
        if (i < 0 || i >= this.f94159a.size()) {
            return null;
        }
        return this.f94159a.get(i);
    }

    /* JADX INFO: renamed from: l */
    public int m120901l() {
        return this.f94159a.size();
    }

    @Override // p153l.ygj0
    @NonNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public eij0 removeListener(@NonNull ygj0.InterfaceC21593g interfaceC21593g) {
        return (eij0) super.removeListener(interfaceC21593g);
    }

    @Override // p153l.ygj0
    @NonNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public eij0 removeTarget(@IdRes int i) {
        for (int i2 = 0; i2 < this.f94159a.size(); i2++) {
            this.f94159a.get(i2).removeTarget(i);
        }
        return (eij0) super.removeTarget(i);
    }

    @Override // p153l.ygj0
    @NonNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public eij0 removeTarget(@NonNull View view) {
        for (int i = 0; i < this.f94159a.size(); i++) {
            this.f94159a.get(i).removeTarget(view);
        }
        return (eij0) super.removeTarget(view);
    }

    @Override // p153l.ygj0
    @NonNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public eij0 removeTarget(@NonNull Class<?> cls) {
        for (int i = 0; i < this.f94159a.size(); i++) {
            this.f94159a.get(i).removeTarget(cls);
        }
        return (eij0) super.removeTarget(cls);
    }

    @Override // p153l.ygj0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void pause(View view) {
        super.pause(view);
        int size = this.f94159a.size();
        for (int i = 0; i < size; i++) {
            this.f94159a.get(i).pause(view);
        }
    }

    @Override // p153l.ygj0
    @NonNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public eij0 removeTarget(@NonNull String str) {
        for (int i = 0; i < this.f94159a.size(); i++) {
            this.f94159a.get(i).removeTarget(str);
        }
        return (eij0) super.removeTarget(str);
    }

    @Override // p153l.ygj0
    @NonNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public eij0 setDuration(long j) {
        ArrayList<ygj0> arrayList;
        super.setDuration(j);
        if (this.mDuration >= 0 && (arrayList = this.f94159a) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f94159a.get(i).setDuration(j);
            }
        }
        return this;
    }

    @Override // p153l.ygj0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void resume(View view) {
        super.resume(view);
        int size = this.f94159a.size();
        for (int i = 0; i < size; i++) {
            this.f94159a.get(i).resume(view);
        }
    }

    @Override // p153l.ygj0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        ArrayList<ygj0> arrayList;
        if (this.f94159a.isEmpty()) {
            start();
            end();
            return;
        }
        m120912w();
        if (this.f94160b) {
            Iterator<ygj0> it = this.f94159a.iterator();
            while (it.hasNext()) {
                it.next().runAnimators();
            }
            return;
        }
        int i = 1;
        while (true) {
            int size = this.f94159a.size();
            arrayList = this.f94159a;
            if (i >= size) {
                break;
            }
            arrayList.get(i - 1).addListener(new C16777a(this.f94159a.get(i)));
            i++;
        }
        ygj0 ygj0Var = arrayList.get(0);
        if (ygj0Var != null) {
            ygj0Var.runAnimators();
        }
    }

    @Override // p153l.ygj0
    @NonNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public eij0 setInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.f94163e |= 1;
        ArrayList<ygj0> arrayList = this.f94159a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f94159a.get(i).setInterpolator(timeInterpolator);
            }
        }
        return (eij0) super.setInterpolator(timeInterpolator);
    }

    @Override // p153l.ygj0
    public void setCanRemoveViews(boolean z) {
        super.setCanRemoveViews(z);
        int size = this.f94159a.size();
        for (int i = 0; i < size; i++) {
            this.f94159a.get(i).setCanRemoveViews(z);
        }
    }

    @Override // p153l.ygj0
    public void setEpicenterCallback(ygj0.AbstractC21592f abstractC21592f) {
        super.setEpicenterCallback(abstractC21592f);
        this.f94163e |= 8;
        int size = this.f94159a.size();
        for (int i = 0; i < size; i++) {
            this.f94159a.get(i).setEpicenterCallback(abstractC21592f);
        }
    }

    @Override // p153l.ygj0
    public void setPathMotion(aj60 aj60Var) {
        super.setPathMotion(aj60Var);
        this.f94163e |= 4;
        if (this.f94159a != null) {
            for (int i = 0; i < this.f94159a.size(); i++) {
                this.f94159a.get(i).setPathMotion(aj60Var);
            }
        }
    }

    @Override // p153l.ygj0
    public void setPropagation(bij0 bij0Var) {
        super.setPropagation(bij0Var);
        this.f94163e |= 2;
        int size = this.f94159a.size();
        for (int i = 0; i < size; i++) {
            this.f94159a.get(i).setPropagation(bij0Var);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public eij0 m120909t(int i) {
        if (i == 0) {
            this.f94160b = true;
            return this;
        }
        if (i == 1) {
            this.f94160b = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
    }

    @Override // p153l.ygj0
    public String toString(String str) {
        String string = super.toString(str);
        for (int i = 0; i < this.f94159a.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(SignParameters.NEW_LINE);
            sb.append(this.f94159a.get(i).toString(str + "  "));
            string = sb.toString();
        }
        return string;
    }

    @Override // p153l.ygj0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public eij0 setSceneRoot(ViewGroup viewGroup) {
        super.setSceneRoot(viewGroup);
        int size = this.f94159a.size();
        for (int i = 0; i < size; i++) {
            this.f94159a.get(i).setSceneRoot(viewGroup);
        }
        return this;
    }

    @Override // p153l.ygj0
    @NonNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public eij0 setStartDelay(long j) {
        return (eij0) super.setStartDelay(j);
    }

    /* JADX INFO: renamed from: w */
    public final void m120912w() {
        C16778b c16778b = new C16778b(this);
        Iterator<ygj0> it = this.f94159a.iterator();
        while (it.hasNext()) {
            it.next().addListener(c16778b);
        }
        this.f94161c = this.f94159a.size();
    }

    @Override // p153l.ygj0
    @NonNull
    public ygj0 excludeTarget(@NonNull String str, boolean z) {
        for (int i = 0; i < this.f94159a.size(); i++) {
            this.f94159a.get(i).excludeTarget(str, z);
        }
        return super.excludeTarget(str, z);
    }

    @Override // p153l.ygj0
    @NonNull
    public ygj0 excludeTarget(int i, boolean z) {
        for (int i2 = 0; i2 < this.f94159a.size(); i2++) {
            this.f94159a.get(i2).excludeTarget(i, z);
        }
        return super.excludeTarget(i, z);
    }

    @Override // p153l.ygj0
    @NonNull
    public ygj0 excludeTarget(@NonNull Class<?> cls, boolean z) {
        for (int i = 0; i < this.f94159a.size(); i++) {
            this.f94159a.get(i).excludeTarget(cls, z);
        }
        return super.excludeTarget(cls, z);
    }
}
