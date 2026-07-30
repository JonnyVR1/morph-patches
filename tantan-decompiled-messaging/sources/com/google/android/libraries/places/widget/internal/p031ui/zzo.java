package com.google.android.libraries.places.widget.internal.p031ui;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C0600f;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.C2462R;
import com.google.android.libraries.places.internal.zzkd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.lig;

/* JADX INFO: loaded from: classes7.dex */
public final class zzo extends C0600f {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();
    private final int zzd;

    public zzo(Resources resources) {
        this.zzd = resources.getDimensionPixelSize(C2462R.dimen.places_autocomplete_vertical_dropdown);
    }

    private final void zzd(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        List list = this.zzc;
        View view = abstractC0566d0.itemView;
        list.add(abstractC0566d0);
        long moveDuration = getMoveDuration() + ((long) (abstractC0566d0.getLayoutPosition() * 67));
        view.setTranslationY(-this.zzd);
        view.setAlpha(0.0f);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        viewPropertyAnimatorAnimate.cancel();
        viewPropertyAnimatorAnimate.translationY(0.0f).alpha(1.0f).setDuration(133L).setInterpolator(new lig()).setStartDelay(moveDuration);
        viewPropertyAnimatorAnimate.setListener(new zzn(this, view, abstractC0566d0, viewPropertyAnimatorAnimate)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzf(View view) {
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.C0600f, androidx.recyclerview.widget.AbstractC0616v
    public final boolean animateAdd(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        try {
            endAnimation(abstractC0566d0);
            abstractC0566d0.itemView.setAlpha(0.0f);
            if (((zzt) abstractC0566d0).zzb()) {
                this.zza.add(abstractC0566d0);
                return true;
            }
            this.zzb.add(abstractC0566d0);
            return true;
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.C0600f, androidx.recyclerview.widget.RecyclerView.AbstractC0574l
    public final void endAnimation(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        try {
            super.endAnimation(abstractC0566d0);
            if (this.zza.remove(abstractC0566d0)) {
                zzf(abstractC0566d0.itemView);
                dispatchAddFinished(abstractC0566d0);
            }
            zze();
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.C0600f, androidx.recyclerview.widget.RecyclerView.AbstractC0574l
    public final void endAnimations() {
        try {
            int size = this.zza.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                RecyclerView.AbstractC0566d0 abstractC0566d0 = (RecyclerView.AbstractC0566d0) this.zza.get(size);
                zzf(abstractC0566d0.itemView);
                dispatchAddFinished(abstractC0566d0);
                this.zza.remove(size);
            }
            List list = this.zzc;
            int size2 = list.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    super.endAnimations();
                    return;
                }
                ((RecyclerView.AbstractC0566d0) list.get(size2)).itemView.animate().cancel();
            }
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.C0600f, androidx.recyclerview.widget.RecyclerView.AbstractC0574l
    public final boolean isRunning() {
        try {
            return (!super.isRunning() && this.zzb.isEmpty() && this.zza.isEmpty() && this.zzc.isEmpty()) ? false : true;
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.C0600f, androidx.recyclerview.widget.RecyclerView.AbstractC0574l
    public final void runPendingAnimations() {
        try {
            Iterator it = this.zzb.iterator();
            while (it.hasNext()) {
                super.animateAdd((RecyclerView.AbstractC0566d0) it.next());
            }
            this.zzb.clear();
            super.runPendingAnimations();
            if (this.zza.isEmpty()) {
                return;
            }
            ArrayList<RecyclerView.AbstractC0566d0> arrayList = new ArrayList(this.zza);
            this.zza.clear();
            for (RecyclerView.AbstractC0566d0 abstractC0566d0 : arrayList) {
                View view = abstractC0566d0.itemView;
                this.zzc.add(abstractC0566d0);
                long moveDuration = getMoveDuration() + ((long) (abstractC0566d0.getLayoutPosition() * 67));
                view.setTranslationY(-this.zzd);
                view.setAlpha(0.0f);
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                viewPropertyAnimatorAnimate.cancel();
                viewPropertyAnimatorAnimate.translationY(0.0f).alpha(1.0f).setDuration(133L).setInterpolator(new lig()).setStartDelay(moveDuration);
                viewPropertyAnimatorAnimate.setListener(new zzn(this, view, abstractC0566d0, viewPropertyAnimatorAnimate)).start();
            }
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }
}
