package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.starboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.view.rollview.LiveRollView;
import com.tantanapp.common.utils.NullChecker;
import p153l.t1g0;
import p153l.x20;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class StarBoardEntryRollView extends LiveRollView<StarBoardEntryItemView> {

    /* JADX INFO: renamed from: i */
    public boolean f51611i;

    public StarBoardEntryRollView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: A */
    public void m76130A(t1g0 t1g0Var) {
        this.f51611i = true;
        StarBoardEntryItemView starBoardEntryItemViewM77875j = m77875j(false);
        if (NullChecker.m82486a(starBoardEntryItemViewM77875j)) {
            starBoardEntryItemViewM77875j.m76128j0(t1g0Var);
            m77888w(new x20() { // from class: l.c2g0
                @Override // p153l.x20
                public final void call() {
                    this.f79476a.m76131z();
                }
            });
        }
    }

    public boolean getRunning() {
        return this.f51611i;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.view.rollview.LiveRollView, android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        return LayoutInflater.from(getContext()).inflate(yec0.f198901R5, (ViewGroup) null);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m76131z() {
        this.f51611i = false;
    }

    public StarBoardEntryRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
