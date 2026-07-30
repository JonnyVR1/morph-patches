package p002l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a5c0;
import l.c1c0;
import l.e3c0;
import l.lqa;
import l.n6c0;
import l.o7r;
import l.qib0;
import l.ura;
import l.vwb;
import l.xdl0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ypa0 extends RecyclerView.Adapter<C0925b> {

    /* JADX INFO: renamed from: a */
    public final Act f23017a;

    /* JADX INFO: renamed from: b */
    public final int f23018b;

    /* JADX INFO: renamed from: c */
    public List<Media> f23019c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0924a f23020d;

    /* JADX INFO: renamed from: e */
    public boolean f23021e;

    /* JADX INFO: renamed from: f */
    public String f23022f;

    /* JADX INFO: renamed from: l.ypa0$a */
    public interface InterfaceC0924a {
        /* JADX INFO: renamed from: a */
        void mo17201a(int i, int i2);
    }

    /* JADX INFO: renamed from: l.ypa0$b */
    public static class C0925b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public VDraweeView f23023a;

        /* JADX INFO: renamed from: b */
        public Group f23024b;

        /* JADX INFO: renamed from: c */
        public Group f23025c;

        /* JADX INFO: renamed from: d */
        public ImageView f23026d;

        /* JADX INFO: renamed from: e */
        public TextView f23027e;

        /* JADX INFO: renamed from: f */
        public View f23028f;

        /* JADX INFO: renamed from: g */
        public View f23029g;

        /* JADX INFO: renamed from: h */
        public VText f23030h;

        /* JADX INFO: renamed from: i */
        public VText f23031i;

        public C0925b(View view) {
            super(view);
            this.f23023a = view.findViewById(a5c0.v);
            this.f23024b = view.findViewById(a5c0.s);
            this.f23026d = (ImageView) view.findViewById(a5c0.J);
            this.f23025c = view.findViewById(a5c0.t);
            this.f23028f = view.findViewById(a5c0.h);
            this.f23029g = view.findViewById(a5c0.i);
            this.f23031i = view.findViewById(a5c0.k);
            this.f23030h = view.findViewById(a5c0.j);
            this.f23027e = (TextView) view.findViewById(a5c0.T);
        }
    }

    public ypa0(Act act, List<Media> list, boolean z, int i, String str) {
        this.f23017a = act;
        this.f23019c = list;
        this.f23021e = z;
        this.f23018b = i;
        this.f23022f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m26860C(int i, View view) {
        InterfaceC0924a interfaceC0924a = this.f23020d;
        if (interfaceC0924a != null) {
            interfaceC0924a.mo17201a(i, 257);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m26861D(int i, View view) {
        InterfaceC0924a interfaceC0924a = this.f23020d;
        if (interfaceC0924a != null) {
            interfaceC0924a.mo17201a(i, 258);
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m26864A(Media media) {
        return TextUtils.isEmpty(media.url);
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C0925b c0925b, final int i) {
        Media media = this.f23019c.get(i);
        if (m26864A(media)) {
            c0925b.f23023a.setVisibility(8);
            c0925b.f23024b.setVisibility(0);
            c0925b.f23025c.setVisibility(0);
            c0925b.f23026d.setVisibility(8);
            ((RecyclerView.d0) c0925b).itemView.setOnClickListener(new View.OnClickListener() { // from class: l.wpa0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21903a.m26860C(i, view);
                }
            });
            m26869I(c0925b.f23031i, c0925b.f23029g, c0925b.f23028f);
            c0925b.f23031i.setText(this.f23022f);
            c0925b.f23030h.setText(this.f23022f);
        } else {
            c0925b.f23023a.setVisibility(0);
            c0925b.f23024b.setVisibility(8);
            c0925b.f23025c.setVisibility(8);
            qib0.G.J0(c0925b.f23023a, media.cover().profile480(), false);
            ((RecyclerView.d0) c0925b).itemView.setOnClickListener(null);
            if (!this.f23021e || i <= 0) {
                ((RecyclerView.d0) c0925b).itemView.setOnClickListener(null);
                c0925b.f23026d.setVisibility(8);
            } else {
                c0925b.f23026d.setVisibility(0);
                ((RecyclerView.d0) c0925b).itemView.setOnClickListener(new View.OnClickListener() { // from class: l.xpa0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f22396a.m26861D(i, view);
                    }
                });
            }
        }
        xdl0.M(c0925b.f23027e, i == 0);
        if (i == 0) {
            c0925b.f23027e.setBackgroundResource(e3c0.n);
            TextView textView = c0925b.f23027e;
            textView.setTextColor(textView.getResources().getColor(c1c0.o));
            c0925b.f23027e.setText("头像");
            return;
        }
        if (lqa.w()) {
            c0925b.f23027e.setBackgroundResource(e3c0.p);
            TextView textView2 = c0925b.f23027e;
            textView2.setTextColor(textView2.getResources().getColor(c1c0.b));
            if (vwb.J(media.tags)) {
                return;
            }
            NewTags newTagsGh = ura.e().d().Gh((String) media.tags.get(0));
            if (!NullChecker.a(newTagsGh) || TextUtils.isEmpty(newTagsGh.name)) {
                xdl0.M(c0925b.f23027e, false);
            } else {
                c0925b.f23027e.setText(newTagsGh.name);
                xdl0.M(c0925b.f23027e, true);
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public C0925b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C0925b(o7r.a(this.f23017a).inflate(n6c0.K0, viewGroup, false));
    }

    /* JADX INFO: renamed from: G */
    public void m26867G(List<Media> list) {
        this.f23019c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: H */
    public void m26868H(InterfaceC0924a interfaceC0924a) {
        this.f23020d = interfaceC0924a;
    }

    /* JADX INFO: renamed from: I */
    public final void m26869I(View... viewArr) {
        if (viewArr.length > 0) {
            AnimatorSet animatorSet = new AnimatorSet();
            for (View view : viewArr) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f));
            }
            animatorSet.setDuration(4000L).start();
        }
    }

    public int getItemCount() {
        return Math.min(this.f23019c.size(), this.f23018b);
    }
}
