package com.p051p1.mobile.putong.core.p058ui.profile.photo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard;
import com.p051p1.mobile.putong.core.p058ui.profile.VReorderCards;
import com.p051p1.mobile.putong.data.Media;
import java.util.ArrayList;
import java.util.List;
import p153l.l51;
import p153l.sec0;
import p153l.t4m;
import p153l.xk1;

/* JADX INFO: loaded from: classes4.dex */
public class AvatarCards extends VReorderCards<AvatarCard> {

    /* JADX INFO: renamed from: C */
    public List<xk1> f34449C;

    /* JADX INFO: renamed from: D */
    public Runnable f34450D;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.photo.AvatarCards$a */
    public class C8848a implements t4m {
        public C8848a() {
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: b */
        public void mo48722b() {
            AvatarCards.this.m52975s();
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: c */
        public void mo48723c() {
            AvatarCards.this.m52975s();
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: d */
        public void mo48724d() {
            l51.m152888H(AvatarCards.this.getContext(), new Runnable() { // from class: l.bl1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f77138a.m52977f();
                }
            }, 200L);
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m52977f() {
            AvatarCards.this.m52975s();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.photo.AvatarCards$b */
    public interface InterfaceC8849b {
        /* JADX INFO: renamed from: a */
        xk1 mo52978a(int i);
    }

    public AvatarCards(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setReorderCardsCallback(new C8848a());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.VReorderCards
    /* JADX INFO: renamed from: p */
    public VReorderCard mo51900p() {
        return (VReorderCard) LayoutInflater.from(getContext()).inflate(sec0.f167544W0, (ViewGroup) this, false);
    }

    /* JADX INFO: renamed from: s */
    public final void m52975s() {
        for (int i = 0; i < this.f33919d; i++) {
            m51994h(i).setConfig(this.f34449C.get(i));
        }
        Runnable runnable = this.f34450D;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setConfig(InterfaceC8849b interfaceC8849b) {
        this.f34449C = new ArrayList();
        for (int i = 0; i < this.f33919d; i++) {
            xk1 xk1VarMo52978a = interfaceC8849b.mo52978a(i);
            xk1VarMo52978a.m211299u(i);
            this.f34449C.add(xk1VarMo52978a);
        }
        setSlideWithoutPress(false);
        setCardsCrop(true);
        m52975s();
    }

    public void setMedia(List<Media> list) {
        int i = 0;
        while (i < this.f33919d) {
            m51994h(i).m52961n0(i < list.size() ? list.get(i) : null);
            i++;
        }
    }

    public void setOnMediaChanged(Runnable runnable) {
        this.f34450D = runnable;
    }

    public AvatarCards(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AvatarCards(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
