package com.p000p1.mobile.putong.core.p001ui.marry.profile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.putong.core.ui.profile.VReorderCards;
import com.p1.mobile.putong.core.ui.profile.photo.AvatarCards;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.a5c0;
import l.n6c0;
import l.qk1;
import l.sk1;
import l.ura;
import p003l.e30;
import p003l.wvl;
import p028v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MarryEditProfileItemAvatarCardView extends VFrame implements wvl {

    /* JADX INFO: renamed from: a */
    public AvatarCards f313a;

    /* JADX INFO: renamed from: b */
    public MarrySeriesType f314b;

    /* JADX INFO: renamed from: c */
    public e30<List<Media>> f315c;

    public MarryEditProfileItemAvatarCardView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m573r() {
        AvatarCards avatarCardsFindViewById = findViewById(a5c0.I);
        this.f313a = avatarCardsFindViewById;
        avatarCardsFindViewById.setViewCount(ura.e().d().X5() ? 9 : 6);
        this.f313a.setConfig(new AvatarCards.b() { // from class: l.uxw
            /* JADX INFO: renamed from: a */
            public final qk1 m8254a(int i) {
                return sk1.e(i).u();
            }
        });
        this.f313a.setOnMediaChanged(new Runnable() { // from class: l.vxw
            @Override // java.lang.Runnable
            public final void run() {
                this.f8461a.m578v();
            }
        });
    }

    @Override // p003l.wvl
    /* JADX INFO: renamed from: d */
    public void mo575d(User user) {
        this.f313a.setMedia(user.pictures);
    }

    @Override // p003l.wvl
    /* JADX INFO: renamed from: f */
    public boolean mo576f() {
        return false;
    }

    public List<Media> getAllMedia() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            AvatarCards avatarCards = this.f313a;
            if (i >= ((VReorderCards) avatarCards).d) {
                return arrayList;
            }
            Media media = avatarCards.h(i).getMedia();
            if (NullChecker.a(media)) {
                arrayList.add(media);
            }
            i++;
        }
    }

    @Override // p003l.wvl
    public View getClickView() {
        return this;
    }

    @Override // p003l.wvl
    public MarrySeriesType getItemType() {
        return this.f314b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(LayoutInflater.from(getContext()).inflate(n6c0.I, (ViewGroup) null), new FrameLayout.LayoutParams(-1, -2));
        m573r();
    }

    @Override // p003l.wvl
    public /* bridge */ /* synthetic */ void setContent(String str) {
        super.setContent(str);
    }

    public void setMediaChangeCallback(e30<List<Media>> e30Var) {
        this.f315c = e30Var;
    }

    /* JADX INFO: renamed from: u */
    public wvl m577u(MarrySeriesType marrySeriesType) {
        this.f314b = marrySeriesType;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public final void m578v() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            AvatarCards avatarCards = this.f313a;
            if (i >= ((VReorderCards) avatarCards).d) {
                break;
            }
            Media media = avatarCards.h(i).getMedia();
            if (NullChecker.a(media)) {
                arrayList.add(media);
            }
            i++;
        }
        if (NullChecker.a(this.f315c)) {
            this.f315c.call(arrayList);
        }
    }

    public MarryEditProfileItemAvatarCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MarryEditProfileItemAvatarCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
