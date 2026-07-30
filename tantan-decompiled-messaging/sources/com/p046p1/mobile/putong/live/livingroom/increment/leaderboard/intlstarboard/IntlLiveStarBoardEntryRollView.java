package com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.view.rollview.LiveRollView;
import com.tantanapp.common.utils.NullChecker;
import p149l.d30;
import p149l.t6c0;
import p149l.y7o;

/* JADX INFO: loaded from: classes4.dex */
public class IntlLiveStarBoardEntryRollView extends LiveRollView<IntlLiveStarBoardEntryItemView> {

    /* JADX INFO: renamed from: i */
    public boolean f50751i;

    /* JADX INFO: renamed from: j */
    public boolean f50752j;

    public IntlLiveStarBoardEntryRollView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: A */
    public void m74932A(final y7o y7oVar) {
        this.f50751i = true;
        final IntlLiveStarBoardEntryItemView intlLiveStarBoardEntryItemViewM76692j = m76692j(false);
        if (NullChecker.m81303a(intlLiveStarBoardEntryItemViewM76692j)) {
            intlLiveStarBoardEntryItemViewM76692j.m74927b(y7oVar);
            m76705w(new d30() { // from class: l.f8o
                @Override // p149l.d30
                public final void call() {
                    this.f96389a.m74933z(intlLiveStarBoardEntryItemViewM76692j, y7oVar);
                }
            });
        }
    }

    public IntlLiveStarBoardEntryItemView getCurrentShowView() {
        IntlLiveStarBoardEntryItemView intlLiveStarBoardEntryItemViewM76692j = m76692j(true);
        if (this.f50752j && intlLiveStarBoardEntryItemViewM76692j != null) {
            intlLiveStarBoardEntryItemViewM76692j.m74930e();
        }
        return intlLiveStarBoardEntryItemViewM76692j;
    }

    public boolean getRunning() {
        return this.f50751i;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.view.rollview.LiveRollView, android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        return LayoutInflater.from(getContext()).inflate(t6c0.f167974B2, (ViewGroup) null);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.view.rollview.LiveRollView, android.widget.ViewSwitcher
    public void reset() {
        super.reset();
        IntlLiveStarBoardEntryItemView intlLiveStarBoardEntryItemViewM76692j = m76692j(false);
        if (NullChecker.m81303a(intlLiveStarBoardEntryItemViewM76692j)) {
            intlLiveStarBoardEntryItemViewM76692j.m74929d();
        }
    }

    public void setVoiceLive(boolean z) {
        this.f50752j = z;
        getCurrentShowView();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m74933z(IntlLiveStarBoardEntryItemView intlLiveStarBoardEntryItemView, y7o y7oVar) {
        this.f50751i = false;
        intlLiveStarBoardEntryItemView.m74928c(y7oVar);
    }

    public IntlLiveStarBoardEntryRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
