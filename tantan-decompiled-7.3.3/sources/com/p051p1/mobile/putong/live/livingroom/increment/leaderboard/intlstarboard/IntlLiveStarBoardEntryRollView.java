package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.view.rollview.LiveRollView;
import com.tantanapp.common.utils.NullChecker;
import p153l.x20;
import p153l.y9o;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class IntlLiveStarBoardEntryRollView extends LiveRollView<IntlLiveStarBoardEntryItemView> {

    /* JADX INFO: renamed from: i */
    public boolean f51599i;

    /* JADX INFO: renamed from: j */
    public boolean f51600j;

    public IntlLiveStarBoardEntryRollView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: A */
    public void m76115A(final y9o y9oVar) {
        this.f51599i = true;
        final IntlLiveStarBoardEntryItemView intlLiveStarBoardEntryItemViewM77875j = m77875j(false);
        if (NullChecker.m82486a(intlLiveStarBoardEntryItemViewM77875j)) {
            intlLiveStarBoardEntryItemViewM77875j.m76110b(y9oVar);
            m77888w(new x20() { // from class: l.fao
                @Override // p153l.x20
                public final void call() {
                    this.f97993a.m76116z(intlLiveStarBoardEntryItemViewM77875j, y9oVar);
                }
            });
        }
    }

    public IntlLiveStarBoardEntryItemView getCurrentShowView() {
        IntlLiveStarBoardEntryItemView intlLiveStarBoardEntryItemViewM77875j = m77875j(true);
        if (this.f51600j && intlLiveStarBoardEntryItemViewM77875j != null) {
            intlLiveStarBoardEntryItemViewM77875j.m76113e();
        }
        return intlLiveStarBoardEntryItemViewM77875j;
    }

    public boolean getRunning() {
        return this.f51599i;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.view.rollview.LiveRollView, android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        return LayoutInflater.from(getContext()).inflate(yec0.f198706B2, (ViewGroup) null);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.view.rollview.LiveRollView, android.widget.ViewSwitcher
    public void reset() {
        super.reset();
        IntlLiveStarBoardEntryItemView intlLiveStarBoardEntryItemViewM77875j = m77875j(false);
        if (NullChecker.m82486a(intlLiveStarBoardEntryItemViewM77875j)) {
            intlLiveStarBoardEntryItemViewM77875j.m76112d();
        }
    }

    public void setVoiceLive(boolean z) {
        this.f51600j = z;
        getCurrentShowView();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m76116z(IntlLiveStarBoardEntryItemView intlLiveStarBoardEntryItemView, y9o y9oVar) {
        this.f51599i = false;
        intlLiveStarBoardEntryItemView.m76111c(y9oVar);
    }

    public IntlLiveStarBoardEntryRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
