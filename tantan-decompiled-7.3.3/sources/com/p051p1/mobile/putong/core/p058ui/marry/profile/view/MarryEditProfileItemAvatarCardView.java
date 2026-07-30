package com.p051p1.mobile.putong.core.p058ui.marry.profile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.core.p058ui.profile.photo.AvatarCards;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VFrame;
import p153l.gdc0;
import p153l.gta;
import p153l.oyl;
import p153l.sec0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileItemAvatarCardView extends VFrame implements oyl {

    /* JADX INFO: renamed from: a */
    public AvatarCards f31270a;

    /* JADX INFO: renamed from: b */
    public MarrySeriesType f31271b;

    /* JADX INFO: renamed from: c */
    public y20<List<Media>> f31272c;

    public MarryEditProfileItemAvatarCardView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m48706r() {
        AvatarCards avatarCards = (AvatarCards) findViewById(gdc0.f103650I);
        this.f31270a = avatarCards;
        avatarCards.setViewCount(gta.m132210e().m132214d().mo34782X5() ? 9 : 6);
        this.f31270a.setConfig(new AvatarCards.InterfaceC8849b() { // from class: l.t0x
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.photo.AvatarCards.InterfaceC8849b
            /* JADX INFO: renamed from: a */
            public final xk1 mo52978a(int i) {
                return zk1.m219996e(i).m211333u();
            }
        });
        this.f31270a.setOnMediaChanged(new Runnable() { // from class: l.u0x
            @Override // java.lang.Runnable
            public final void run() {
                this.f176949a.m48711v();
            }
        });
    }

    @Override // p153l.oyl
    /* JADX INFO: renamed from: d */
    public void mo48708d(User user) {
        this.f31270a.setMedia(user.pictures);
    }

    @Override // p153l.oyl
    /* JADX INFO: renamed from: f */
    public boolean mo48709f() {
        return false;
    }

    public List<Media> getAllMedia() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            AvatarCards avatarCards = this.f31270a;
            if (i >= avatarCards.f33919d) {
                return arrayList;
            }
            Media media = avatarCards.m51994h(i).getMedia();
            if (NullChecker.m82486a(media)) {
                arrayList.add(media);
            }
            i++;
        }
    }

    @Override // p153l.oyl
    public View getClickView() {
        return this;
    }

    @Override // p153l.oyl
    public MarrySeriesType getItemType() {
        return this.f31271b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(LayoutInflater.from(getContext()).inflate(sec0.f167515I, (ViewGroup) null), new FrameLayout.LayoutParams(-1, -2));
        m48706r();
    }

    @Override // p153l.oyl
    public /* bridge */ /* synthetic */ void setContent(String str) {
        super.setContent(str);
    }

    public void setMediaChangeCallback(y20<List<Media>> y20Var) {
        this.f31272c = y20Var;
    }

    /* JADX INFO: renamed from: u */
    public oyl m48710u(MarrySeriesType marrySeriesType) {
        this.f31271b = marrySeriesType;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public final void m48711v() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            AvatarCards avatarCards = this.f31270a;
            if (i >= avatarCards.f33919d) {
                break;
            }
            Media media = avatarCards.m51994h(i).getMedia();
            if (NullChecker.m82486a(media)) {
                arrayList.add(media);
            }
            i++;
        }
        if (NullChecker.m82486a(this.f31272c)) {
            this.f31272c.call(arrayList);
        }
    }

    public MarryEditProfileItemAvatarCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MarryEditProfileItemAvatarCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
