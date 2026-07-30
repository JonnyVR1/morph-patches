package com.p046p1.mobile.putong.core.p053ui.marry.profile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.core.p053ui.profile.photo.AvatarCards;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VFrame;
import p149l.a5c0;
import p149l.e30;
import p149l.n6c0;
import p149l.ura;
import p149l.wvl;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileItemAvatarCardView extends VFrame implements wvl {

    /* JADX INFO: renamed from: a */
    public AvatarCards f30422a;

    /* JADX INFO: renamed from: b */
    public MarrySeriesType f30423b;

    /* JADX INFO: renamed from: c */
    public e30<List<Media>> f30424c;

    public MarryEditProfileItemAvatarCardView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m47523r() {
        AvatarCards avatarCards = (AvatarCards) findViewById(a5c0.f67655I);
        this.f30422a = avatarCards;
        avatarCards.setViewCount(ura.m195053e().m195057d().mo33779X5() ? 9 : 6);
        this.f30422a.setConfig(new AvatarCards.InterfaceC8686b() { // from class: l.uxw
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.photo.AvatarCards.InterfaceC8686b
            /* JADX INFO: renamed from: a */
            public final qk1 mo51795a(int i) {
                return sk1.m184573e(i).m175124u();
            }
        });
        this.f30422a.setOnMediaChanged(new Runnable() { // from class: l.vxw
            @Override // java.lang.Runnable
            public final void run() {
                this.f183479a.m47528v();
            }
        });
    }

    @Override // p149l.wvl
    /* JADX INFO: renamed from: d */
    public void mo47525d(User user) {
        this.f30422a.setMedia(user.pictures);
    }

    @Override // p149l.wvl
    /* JADX INFO: renamed from: f */
    public boolean mo47526f() {
        return false;
    }

    public List<Media> getAllMedia() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            AvatarCards avatarCards = this.f30422a;
            if (i >= avatarCards.f33071d) {
                return arrayList;
            }
            Media media = avatarCards.m50811h(i).getMedia();
            if (NullChecker.m81303a(media)) {
                arrayList.add(media);
            }
            i++;
        }
    }

    @Override // p149l.wvl
    public View getClickView() {
        return this;
    }

    @Override // p149l.wvl
    public MarrySeriesType getItemType() {
        return this.f30423b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(LayoutInflater.from(getContext()).inflate(n6c0.f137301I, (ViewGroup) null), new FrameLayout.LayoutParams(-1, -2));
        m47523r();
    }

    @Override // p149l.wvl
    public /* bridge */ /* synthetic */ void setContent(String str) {
        super.setContent(str);
    }

    public void setMediaChangeCallback(e30<List<Media>> e30Var) {
        this.f30424c = e30Var;
    }

    /* JADX INFO: renamed from: u */
    public wvl m47527u(MarrySeriesType marrySeriesType) {
        this.f30423b = marrySeriesType;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public final void m47528v() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            AvatarCards avatarCards = this.f30422a;
            if (i >= avatarCards.f33071d) {
                break;
            }
            Media media = avatarCards.m50811h(i).getMedia();
            if (NullChecker.m81303a(media)) {
                arrayList.add(media);
            }
            i++;
        }
        if (NullChecker.m81303a(this.f30424c)) {
            this.f30424c.call(arrayList);
        }
    }

    public MarryEditProfileItemAvatarCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MarryEditProfileItemAvatarCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
