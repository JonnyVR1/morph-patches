package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VFrame;
import p151v.VLinear;

/* JADX INFO: loaded from: classes11.dex */
public class njm extends h11 {

    /* JADX INFO: renamed from: h */
    public static final int f142308h = kec0.f125711Y6;

    /* JADX INFO: renamed from: a */
    public VFrame f142309a;

    /* JADX INFO: renamed from: b */
    public VLinear f142310b;

    /* JADX INFO: renamed from: c */
    public View f142311c;

    /* JADX INFO: renamed from: d */
    public View f142312d;

    /* JADX INFO: renamed from: e */
    public PictureView f142313e;

    /* JADX INFO: renamed from: f */
    public NewPictureContainerIndicator f142314f;

    /* JADX INFO: renamed from: g */
    public int f142315g;

    /* JADX INFO: renamed from: l.njm$a */
    public class ViewOnClickListenerC18884a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f142316a;

        public ViewOnClickListenerC18884a(User user) {
            this.f142316a = user;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = njm.this.f142315g;
            if (i > 0) {
                if (this.f142316a.media(i) instanceof Video) {
                    njm.this.f142313e.mo37119d();
                    njm.this.f142313e.m45173U();
                }
                njm njmVar = njm.this;
                int i2 = njmVar.f142315g - 1;
                njmVar.f142315g = i2;
                njm.this.f142313e.m45176X(this.f142316a.media(i2));
                njm njmVar2 = njm.this;
                njmVar2.f142314f.setSelectedIndex(njmVar2.f142315g);
            }
        }
    }

    /* JADX INFO: renamed from: l.njm$b */
    public class ViewOnClickListenerC18885b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f142318a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f142319b;

        public ViewOnClickListenerC18885b(List list, User user) {
            this.f142318a = list;
            this.f142319b = user;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (njm.this.f142315g < this.f142318a.size() - 1) {
                if (this.f142319b.media(njm.this.f142315g) instanceof Video) {
                    njm.this.f142313e.mo37119d();
                }
                njm njmVar = njm.this;
                int i = njmVar.f142315g + 1;
                njmVar.f142315g = i;
                njm.this.f142313e.m45176X(this.f142319b.media(i));
                njm njmVar2 = njm.this;
                njmVar2.f142314f.setSelectedIndex(njmVar2.f142315g);
            }
        }
    }

    /* JADX INFO: renamed from: l.njm$c */
    public static class C18886c extends hll0 {
        @Override // p153l.hll0
        /* JADX INFO: renamed from: a */
        public h11 mo135759a(ViewGroup viewGroup) {
            return new njm(LayoutInflater.from(viewGroup.getContext()).inflate(njm.f142308h, viewGroup, false));
        }
    }

    public njm(@NonNull View view) {
        super(view);
        this.f142315g = 0;
        m163428c(view);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8319s(qa00.m175859d(10.0f));
        this.f142313e.f28918a.getHierarchy().m207045H(roundingParams);
        this.f142313e.f28918a.getHierarchy().m207065z(dbc0.f86649V0);
        this.f142313e.setVideoViewRadius(10);
        this.f142313e.m45167L(true, false, true, true);
    }

    @Override // p153l.h11
    /* JADX INFO: renamed from: a */
    public void mo133267a(@Nullable User user, boolean z) {
        Media media;
        List<Media> list = user.pictures;
        int size = list.size();
        View view = this.itemView;
        if (size <= 0) {
            bnl0.m105524M(view, false);
            return;
        }
        bnl0.m105524M(view, true);
        this.f142313e.f28900M = true;
        int size2 = list.size();
        NewPictureContainerIndicator newPictureContainerIndicator = this.f142314f;
        if (size2 >= 2) {
            bnl0.m105524M(newPictureContainerIndicator, true);
            this.f142314f.setIndicatorCount(list.size());
            this.f142314f.setSelectedIndex(1);
            media = user.media(1);
            this.f142315g = 1;
        } else {
            bnl0.m105524M(newPictureContainerIndicator, false);
            media = user.media(0);
            this.f142315g = 0;
        }
        this.f142313e.m45176X(media);
        this.f142311c.setOnClickListener(new ViewOnClickListenerC18884a(user));
        this.f142312d.setOnClickListener(new ViewOnClickListenerC18885b(list, user));
    }

    @Override // p153l.h11
    /* JADX INFO: renamed from: b */
    public void mo133268b() {
        super.mo133268b();
        if (NullChecker.m82486a(this.f142313e)) {
            this.f142313e.mo37119d();
            this.f142313e.m45173U();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m163428c(View view) {
        ojm.m167867a(this, view);
    }
}
