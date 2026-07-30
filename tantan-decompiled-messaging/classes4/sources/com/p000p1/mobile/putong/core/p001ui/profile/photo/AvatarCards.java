package com.p000p1.mobile.putong.core.p001ui.profile.photo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard;
import com.p000p1.mobile.putong.core.p001ui.profile.VReorderCards;
import com.p1.mobile.putong.data.Media;
import java.util.ArrayList;
import java.util.List;
import l.e51;
import l.n6c0;
import p002l.a2m;
import p002l.qk1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class AvatarCards extends VReorderCards<AvatarCard> {

    /* JADX INFO: renamed from: C */
    public List<qk1> f1423C;

    /* JADX INFO: renamed from: D */
    public Runnable f1424D;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.photo.AvatarCards$a */
    public class C0110a implements a2m {
        public C0110a() {
        }

        @Override // p002l.a2m
        /* JADX INFO: renamed from: b */
        public void mo1668b() {
            AvatarCards.this.m2320s();
        }

        @Override // p002l.a2m
        /* JADX INFO: renamed from: c */
        public void mo1669c() {
            AvatarCards.this.m2320s();
        }

        @Override // p002l.a2m
        /* JADX INFO: renamed from: d */
        public void mo1670d() {
            e51.H(AvatarCards.this.getContext(), new Runnable() { // from class: l.uk1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20681a.m2322f();
                }
            }, 200L);
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m2322f() {
            AvatarCards.this.m2320s();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.photo.AvatarCards$b */
    public interface InterfaceC0111b {
        /* JADX INFO: renamed from: a */
        qk1 mo2323a(int i);
    }

    public AvatarCards(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setReorderCardsCallback(new C0110a());
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.VReorderCards
    /* JADX INFO: renamed from: p */
    public VReorderCard mo1153p() {
        return (VReorderCard) LayoutInflater.from(getContext()).inflate(n6c0.W0, (ViewGroup) this, false);
    }

    /* JADX INFO: renamed from: s */
    public final void m2320s() {
        for (int i = 0; i < this.f893d; i++) {
            m1257h(i).setConfig(this.f1423C.get(i));
        }
        Runnable runnable = this.f1424D;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setConfig(InterfaceC0111b interfaceC0111b) {
        this.f1423C = new ArrayList();
        for (int i = 0; i < this.f893d; i++) {
            qk1 qk1VarMo2323a = interfaceC0111b.mo2323a(i);
            qk1VarMo2323a.m21312u(i);
            this.f1423C.add(qk1VarMo2323a);
        }
        setSlideWithoutPress(false);
        setCardsCrop(true);
        m2320s();
    }

    public void setMedia(List<Media> list) {
        int i = 0;
        while (i < this.f893d) {
            m1257h(i).m2306n0(i < list.size() ? list.get(i) : null);
            i++;
        }
    }

    public void setOnMediaChanged(Runnable runnable) {
        this.f1424D = runnable;
    }

    public AvatarCards(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AvatarCards(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
