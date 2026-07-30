package com.p046p1.mobile.putong.core.p053ui.profile.photo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard;
import com.p046p1.mobile.putong.core.p053ui.profile.VReorderCards;
import com.p046p1.mobile.putong.data.Media;
import java.util.ArrayList;
import java.util.List;
import p149l.a2m;
import p149l.e51;
import p149l.n6c0;
import p149l.qk1;

/* JADX INFO: loaded from: classes4.dex */
public class AvatarCards extends VReorderCards<AvatarCard> {

    /* JADX INFO: renamed from: C */
    public List<qk1> f33601C;

    /* JADX INFO: renamed from: D */
    public Runnable f33602D;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.photo.AvatarCards$a */
    public class C8685a implements a2m {
        public C8685a() {
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: b */
        public void mo47539b() {
            AvatarCards.this.m51792s();
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: c */
        public void mo47540c() {
            AvatarCards.this.m51792s();
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: d */
        public void mo47541d() {
            e51.m114743H(AvatarCards.this.getContext(), new Runnable() { // from class: l.uk1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f176898a.m51794f();
                }
            }, 200L);
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m51794f() {
            AvatarCards.this.m51792s();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.photo.AvatarCards$b */
    public interface InterfaceC8686b {
        /* JADX INFO: renamed from: a */
        qk1 mo51795a(int i);
    }

    public AvatarCards(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setReorderCardsCallback(new C8685a());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.VReorderCards
    /* JADX INFO: renamed from: p */
    public VReorderCard mo50717p() {
        return (VReorderCard) LayoutInflater.from(getContext()).inflate(n6c0.f137330W0, (ViewGroup) this, false);
    }

    /* JADX INFO: renamed from: s */
    public final void m51792s() {
        for (int i = 0; i < this.f33071d; i++) {
            m50811h(i).setConfig(this.f33601C.get(i));
        }
        Runnable runnable = this.f33602D;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setConfig(InterfaceC8686b interfaceC8686b) {
        this.f33601C = new ArrayList();
        for (int i = 0; i < this.f33071d; i++) {
            qk1 qk1VarMo51795a = interfaceC8686b.mo51795a(i);
            qk1VarMo51795a.m175090u(i);
            this.f33601C.add(qk1VarMo51795a);
        }
        setSlideWithoutPress(false);
        setCardsCrop(true);
        m51792s();
    }

    public void setMedia(List<Media> list) {
        int i = 0;
        while (i < this.f33071d) {
            m50811h(i).m51778n0(i < list.size() ? list.get(i) : null);
            i++;
        }
    }

    public void setOnMediaChanged(Runnable runnable) {
        this.f33602D = runnable;
    }

    public AvatarCards(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AvatarCards(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
