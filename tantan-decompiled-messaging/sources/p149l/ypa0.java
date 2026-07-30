package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ypa0 extends RecyclerView.Adapter<C21461b> {

    /* JADX INFO: renamed from: a */
    public final Act f199406a;

    /* JADX INFO: renamed from: b */
    public final int f199407b;

    /* JADX INFO: renamed from: c */
    public List<Media> f199408c;

    /* JADX INFO: renamed from: d */
    public InterfaceC21460a f199409d;

    /* JADX INFO: renamed from: e */
    public boolean f199410e;

    /* JADX INFO: renamed from: f */
    public String f199411f;

    /* JADX INFO: renamed from: l.ypa0$a */
    public interface InterfaceC21460a {
        /* JADX INFO: renamed from: a */
        void mo149662a(int i, int i2);
    }

    /* JADX INFO: renamed from: l.ypa0$b */
    public static class C21461b extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public VDraweeView f199412a;

        /* JADX INFO: renamed from: b */
        public Group f199413b;

        /* JADX INFO: renamed from: c */
        public Group f199414c;

        /* JADX INFO: renamed from: d */
        public ImageView f199415d;

        /* JADX INFO: renamed from: e */
        public TextView f199416e;

        /* JADX INFO: renamed from: f */
        public View f199417f;

        /* JADX INFO: renamed from: g */
        public View f199418g;

        /* JADX INFO: renamed from: h */
        public VText f199419h;

        /* JADX INFO: renamed from: i */
        public VText f199420i;

        public C21461b(View view) {
            super(view);
            this.f199412a = (VDraweeView) view.findViewById(a5c0.f67699v);
            this.f199413b = (Group) view.findViewById(a5c0.f67696s);
            this.f199415d = (ImageView) view.findViewById(a5c0.f67656J);
            this.f199414c = (Group) view.findViewById(a5c0.f67697t);
            this.f199417f = view.findViewById(a5c0.f67685h);
            this.f199418g = view.findViewById(a5c0.f67686i);
            this.f199420i = (VText) view.findViewById(a5c0.f67688k);
            this.f199419h = (VText) view.findViewById(a5c0.f67687j);
            this.f199416e = (TextView) view.findViewById(a5c0.f67666T);
        }
    }

    public ypa0(Act act, List<Media> list, boolean z, int i, String str) {
        this.f199406a = act;
        this.f199408c = list;
        this.f199410e = z;
        this.f199407b = i;
        this.f199411f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m215578C(int i, View view) {
        InterfaceC21460a interfaceC21460a = this.f199409d;
        if (interfaceC21460a != null) {
            interfaceC21460a.mo149662a(i, 257);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m215579D(int i, View view) {
        InterfaceC21460a interfaceC21460a = this.f199409d;
        if (interfaceC21460a != null) {
            interfaceC21460a.mo149662a(i, 258);
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m215582A(Media media) {
        return TextUtils.isEmpty(media.url);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C21461b c21461b, final int i) {
        Media media = this.f199408c.get(i);
        if (m215582A(media)) {
            c21461b.f199412a.setVisibility(8);
            c21461b.f199413b.setVisibility(0);
            c21461b.f199414c.setVisibility(0);
            c21461b.f199415d.setVisibility(8);
            c21461b.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.wpa0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f187499a.m215578C(i, view);
                }
            });
            m215587I(c21461b.f199420i, c21461b.f199418g, c21461b.f199417f);
            c21461b.f199420i.setText(this.f199411f);
            c21461b.f199419h.setText(this.f199411f);
        } else {
            c21461b.f199412a.setVisibility(0);
            c21461b.f199413b.setVisibility(8);
            c21461b.f199414c.setVisibility(8);
            qib0.f154691G.m102327J0(c21461b.f199412a, media.cover().profile480(), false);
            c21461b.itemView.setOnClickListener(null);
            if (!this.f199410e || i <= 0) {
                c21461b.itemView.setOnClickListener(null);
                c21461b.f199415d.setVisibility(8);
            } else {
                c21461b.f199415d.setVisibility(0);
                c21461b.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.xpa0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f193906a.m215579D(i, view);
                    }
                });
            }
        }
        xdl0.m208344M(c21461b.f199416e, i == 0);
        if (i == 0) {
            c21461b.f199416e.setBackgroundResource(e3c0.f89129n);
            TextView textView = c21461b.f199416e;
            textView.setTextColor(textView.getResources().getColor(c1c0.f78258o));
            c21461b.f199416e.setText("头像");
            return;
        }
        if (lqa.m150985w()) {
            c21461b.f199416e.setBackgroundResource(e3c0.f89135p);
            TextView textView2 = c21461b.f199416e;
            textView2.setTextColor(textView2.getResources().getColor(c1c0.f78245b));
            if (vwb.m200296J(media.tags)) {
                return;
            }
            NewTags newTagsMo33691Gh = ura.m195053e().m195057d().mo33691Gh(media.tags.get(0));
            if (!NullChecker.m81303a(newTagsMo33691Gh) || TextUtils.isEmpty(newTagsMo33691Gh.name)) {
                xdl0.m208344M(c21461b.f199416e, false);
            } else {
                c21461b.f199416e.setText(newTagsMo33691Gh.name);
                xdl0.m208344M(c21461b.f199416e, true);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public C21461b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C21461b(o7r.m163037a(this.f199406a).inflate(n6c0.f137306K0, viewGroup, false));
    }

    /* JADX INFO: renamed from: G */
    public void m215585G(List<Media> list) {
        this.f199408c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: H */
    public void m215586H(InterfaceC21460a interfaceC21460a) {
        this.f199409d = interfaceC21460a;
    }

    /* JADX INFO: renamed from: I */
    public final void m215587I(View... viewArr) {
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
        return Math.min(this.f199408c.size(), this.f199407b);
    }
}
