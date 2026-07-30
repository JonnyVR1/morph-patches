package com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.starboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.livingroom.view.rollview.LiveRollView;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import p002l.ktf0;
import p002l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class StarBoardEntryRollView extends LiveRollView<StarBoardEntryItemView> {

    /* JADX INFO: renamed from: i */
    public boolean f6805i;

    public StarBoardEntryRollView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: A */
    public void m8551A(ktf0 ktf0Var) {
        this.f6805i = true;
        StarBoardEntryItemView starBoardEntryItemView = (StarBoardEntryItemView) j(false);
        if (NullChecker.a(starBoardEntryItemView)) {
            starBoardEntryItemView.m8549j0(ktf0Var);
            w(new d30() { // from class: l.ttf0
                public final void call() {
                    this.f20372a.m8552z();
                }
            });
        }
    }

    public boolean getRunning() {
        return this.f6805i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View makeView() {
        return LayoutInflater.from(getContext()).inflate(t6c0.f19665R5, (ViewGroup) null);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m8552z() {
        this.f6805i = false;
    }

    public StarBoardEntryRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
