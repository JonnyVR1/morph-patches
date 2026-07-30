package com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.starboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.view.rollview.LiveRollView;
import com.tantanapp.common.utils.NullChecker;
import p149l.d30;
import p149l.ktf0;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class StarBoardEntryRollView extends LiveRollView<StarBoardEntryItemView> {

    /* JADX INFO: renamed from: i */
    public boolean f50763i;

    public StarBoardEntryRollView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: A */
    public void m74947A(ktf0 ktf0Var) {
        this.f50763i = true;
        StarBoardEntryItemView starBoardEntryItemViewM76692j = m76692j(false);
        if (NullChecker.m81303a(starBoardEntryItemViewM76692j)) {
            starBoardEntryItemViewM76692j.m74945j0(ktf0Var);
            m76705w(new d30() { // from class: l.ttf0
                @Override // p149l.d30
                public final void call() {
                    this.f172025a.m74948z();
                }
            });
        }
    }

    public boolean getRunning() {
        return this.f50763i;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.view.rollview.LiveRollView, android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        return LayoutInflater.from(getContext()).inflate(t6c0.f168169R5, (ViewGroup) null);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m74948z() {
        this.f50763i = false;
    }

    public StarBoardEntryRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
