package com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.livingroom.view.rollview.LiveRollView;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import p002l.t6c0;
import p002l.y7o;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class IntlLiveStarBoardEntryRollView extends LiveRollView<IntlLiveStarBoardEntryItemView> {

    /* JADX INFO: renamed from: i */
    public boolean f6793i;

    /* JADX INFO: renamed from: j */
    public boolean f6794j;

    public IntlLiveStarBoardEntryRollView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: A */
    public void m8534A(final y7o y7oVar) {
        this.f6793i = true;
        final IntlLiveStarBoardEntryItemView intlLiveStarBoardEntryItemView = (IntlLiveStarBoardEntryItemView) j(false);
        if (NullChecker.a(intlLiveStarBoardEntryItemView)) {
            intlLiveStarBoardEntryItemView.m8529b(y7oVar);
            w(new d30() { // from class: l.f8o
                public final void call() {
                    this.f10189a.m8535z(intlLiveStarBoardEntryItemView, y7oVar);
                }
            });
        }
    }

    public IntlLiveStarBoardEntryItemView getCurrentShowView() {
        IntlLiveStarBoardEntryItemView intlLiveStarBoardEntryItemView = (IntlLiveStarBoardEntryItemView) j(true);
        if (this.f6794j && intlLiveStarBoardEntryItemView != null) {
            intlLiveStarBoardEntryItemView.m8532e();
        }
        return intlLiveStarBoardEntryItemView;
    }

    public boolean getRunning() {
        return this.f6793i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View makeView() {
        return LayoutInflater.from(getContext()).inflate(t6c0.f19470B2, (ViewGroup) null);
    }

    public void reset() {
        super.reset();
        IntlLiveStarBoardEntryItemView intlLiveStarBoardEntryItemView = (IntlLiveStarBoardEntryItemView) j(false);
        if (NullChecker.a(intlLiveStarBoardEntryItemView)) {
            intlLiveStarBoardEntryItemView.m8531d();
        }
    }

    public void setVoiceLive(boolean z) {
        this.f6794j = z;
        getCurrentShowView();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m8535z(IntlLiveStarBoardEntryItemView intlLiveStarBoardEntryItemView, y7o y7oVar) {
        this.f6793i = false;
        intlLiveStarBoardEntryItemView.m8530c(y7oVar);
    }

    public IntlLiveStarBoardEntryRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
