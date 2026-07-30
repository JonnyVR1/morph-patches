package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cya0 extends RecyclerView.Adapter<C16393b> {

    /* JADX INFO: renamed from: a */
    public final Act f84308a;

    /* JADX INFO: renamed from: b */
    public final int f84309b;

    /* JADX INFO: renamed from: c */
    public List<Media> f84310c;

    /* JADX INFO: renamed from: d */
    public InterfaceC16392a f84311d;

    /* JADX INFO: renamed from: e */
    public boolean f84312e;

    /* JADX INFO: renamed from: f */
    public String f84313f;

    /* JADX INFO: renamed from: l.cya0$a */
    public interface InterfaceC16392a {
        /* JADX INFO: renamed from: a */
        void mo113108a(int i, int i2);
    }

    /* JADX INFO: renamed from: l.cya0$b */
    public static class C16393b extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public VDraweeView f84314a;

        /* JADX INFO: renamed from: b */
        public Group f84315b;

        /* JADX INFO: renamed from: c */
        public Group f84316c;

        /* JADX INFO: renamed from: d */
        public ImageView f84317d;

        /* JADX INFO: renamed from: e */
        public TextView f84318e;

        /* JADX INFO: renamed from: f */
        public View f84319f;

        /* JADX INFO: renamed from: g */
        public View f84320g;

        /* JADX INFO: renamed from: h */
        public VText f84321h;

        /* JADX INFO: renamed from: i */
        public VText f84322i;

        public C16393b(View view) {
            super(view);
            this.f84314a = (VDraweeView) view.findViewById(gdc0.f103694v);
            this.f84315b = (Group) view.findViewById(gdc0.f103691s);
            this.f84317d = (ImageView) view.findViewById(gdc0.f103651J);
            this.f84316c = (Group) view.findViewById(gdc0.f103692t);
            this.f84319f = view.findViewById(gdc0.f103680h);
            this.f84320g = view.findViewById(gdc0.f103681i);
            this.f84322i = (VText) view.findViewById(gdc0.f103683k);
            this.f84321h = (VText) view.findViewById(gdc0.f103682j);
            this.f84318e = (TextView) view.findViewById(gdc0.f103661T);
        }
    }

    public cya0(Act act, List<Media> list, boolean z, int i, String str) {
        this.f84308a = act;
        this.f84310c = list;
        this.f84312e = z;
        this.f84309b = i;
        this.f84313f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m113098C(int i, View view) {
        InterfaceC16392a interfaceC16392a = this.f84311d;
        if (interfaceC16392a != null) {
            interfaceC16392a.mo113108a(i, 257);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m113099D(int i, View view) {
        InterfaceC16392a interfaceC16392a = this.f84311d;
        if (interfaceC16392a != null) {
            interfaceC16392a.mo113108a(i, 258);
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m113102A(Media media) {
        return TextUtils.isEmpty(media.url);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C16393b c16393b, final int i) {
        Media media = this.f84310c.get(i);
        if (m113102A(media)) {
            c16393b.f84314a.setVisibility(8);
            c16393b.f84315b.setVisibility(0);
            c16393b.f84316c.setVisibility(0);
            c16393b.f84317d.setVisibility(8);
            c16393b.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.aya0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f73958a.m113098C(i, view);
                }
            });
            m113107I(c16393b.f84322i, c16393b.f84320g, c16393b.f84319f);
            c16393b.f84322i.setText(this.f84313f);
            c16393b.f84321h.setText(this.f84313f);
        } else {
            c16393b.f84314a.setVisibility(0);
            c16393b.f84315b.setVisibility(8);
            c16393b.f84316c.setVisibility(8);
            uqb0.f180374G.m127111J0(c16393b.f84314a, media.cover().profile480(), false);
            c16393b.itemView.setOnClickListener(null);
            if (!this.f84312e || i <= 0) {
                c16393b.itemView.setOnClickListener(null);
                c16393b.f84317d.setVisibility(8);
            } else {
                c16393b.f84317d.setVisibility(0);
                c16393b.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.bya0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f78998a.m113099D(i, view);
                    }
                });
            }
        }
        bnl0.m105524M(c16393b.f84318e, i == 0);
        if (i == 0) {
            c16393b.f84318e.setBackgroundResource(kbc0.f124892n);
            TextView textView = c16393b.f84318e;
            textView.setTextColor(textView.getResources().getColor(j9c0.f118878o));
            c16393b.f84318e.setText("头像");
            return;
        }
        if (xra.m212804w()) {
            c16393b.f84318e.setBackgroundResource(kbc0.f124898p);
            TextView textView2 = c16393b.f84318e;
            textView2.setTextColor(textView2.getResources().getColor(j9c0.f118865b));
            if (jyb.m147479J(media.tags)) {
                return;
            }
            NewTags newTagsMo34694Gh = gta.m132210e().m132214d().mo34694Gh(media.tags.get(0));
            if (!NullChecker.m82486a(newTagsMo34694Gh) || TextUtils.isEmpty(newTagsMo34694Gh.name)) {
                bnl0.m105524M(c16393b.f84318e, false);
            } else {
                c16393b.f84318e.setText(newTagsMo34694Gh.name);
                bnl0.m105524M(c16393b.f84318e, true);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public C16393b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C16393b(p9r.m171370a(this.f84308a).inflate(sec0.f167520K0, viewGroup, false));
    }

    /* JADX INFO: renamed from: G */
    public void m113105G(List<Media> list) {
        this.f84310c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: H */
    public void m113106H(InterfaceC16392a interfaceC16392a) {
        this.f84311d = interfaceC16392a;
    }

    /* JADX INFO: renamed from: I */
    public final void m113107I(View... viewArr) {
        if (viewArr.length > 0) {
            AnimatorSet animatorSet = new AnimatorSet();
            for (View view : viewArr) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f));
            }
            animatorSet.setDuration(4000L).start();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return Math.min(this.f84310c.size(), this.f84309b);
    }
}
