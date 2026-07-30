package p153l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.FateRadarSearchConditions;
import com.p051p1.mobile.putong.core.data.FilterConditionsCustomItems;
import com.p051p1.mobile.putong.core.data.FilterConditionsStatusItem;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Interest;
import com.p051p1.mobile.putong.data.Profile;
import java.util.ArrayList;
import java.util.List;
import p151v.VProgressBar;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class ufw implements iam<tfw> {

    /* JADX INFO: renamed from: l */
    public static final String[] f178814l = {"对方状态（多选）", "你在意的特质（多选）", "兴趣爱好（多选）"};

    /* JADX INFO: renamed from: a */
    public VNavigationBar f178815a;

    /* JADX INFO: renamed from: b */
    public ViewPager2 f178816b;

    /* JADX INFO: renamed from: c */
    public VText f178817c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f178818d;

    /* JADX INFO: renamed from: e */
    public final Act f178819e;

    /* JADX INFO: renamed from: f */
    public tfw f178820f;

    /* JADX INFO: renamed from: g */
    public C20564d f178821g;

    /* JADX INFO: renamed from: h */
    public List<NewTags> f178822h;

    /* JADX INFO: renamed from: i */
    public String f178823i;

    /* JADX INFO: renamed from: j */
    public FilterConditionsCustomItems f178824j;

    /* JADX INFO: renamed from: k */
    public FateRadarSearchConditions f178825k;

    /* JADX INFO: renamed from: l.ufw$a */
    public class ViewOnClickListenerC20561a implements View.OnClickListener {

        /* JADX INFO: renamed from: l.ufw$a$a */
        public class a implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f178827a;

            public a(int i) {
                this.f178827a = i;
            }

            @Override // p153l.x20
            public void call() {
                int i = this.f178827a;
                if (i == 0) {
                    int size = ufw.this.f178822h.size();
                    ViewOnClickListenerC20561a viewOnClickListenerC20561a = ViewOnClickListenerC20561a.this;
                    if (size > 0) {
                        ufw.this.f178817c.setText("下一步");
                    } else {
                        ufw.this.f178817c.setText("完成");
                    }
                    ufw.this.f178816b.setCurrentItem(this.f178827a + 1);
                    return;
                }
                if (i != 1) {
                    if (i == 2) {
                        ufw.this.f178819e.m48999H2();
                    }
                } else {
                    int size2 = ufw.this.f178822h.size();
                    ViewOnClickListenerC20561a viewOnClickListenerC20561a2 = ViewOnClickListenerC20561a.this;
                    if (size2 > 0) {
                        ufw.this.f178816b.setCurrentItem(this.f178827a + 1);
                    } else {
                        ufw.this.f178819e.m48999H2();
                    }
                    ufw.this.f178817c.setText("完成");
                }
            }
        }

        public ViewOnClickListenerC20561a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int currentItem = ufw.this.f178816b.getCurrentItem();
            ufw ufwVar = ufw.this;
            ufwVar.f178825k.customItems = ufwVar.f178821g.m195876y();
            ufw.this.f178820f.m190992i0(ufw.this.f178825k, new a(currentItem));
        }
    }

    /* JADX INFO: renamed from: l.ufw$b */
    public static class C20562b extends RecyclerView.Adapter<C20563c> {

        /* JADX INFO: renamed from: a */
        public List<FilterConditionsStatusItem> f178829a;

        /* JADX INFO: renamed from: b */
        public x20 f178830b;

        /* JADX INFO: renamed from: l.ufw$b$a */
        public class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ FilterConditionsStatusItem f178831a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C20563c f178832b;

            public a(FilterConditionsStatusItem filterConditionsStatusItem, C20563c c20563c) {
                this.f178831a = filterConditionsStatusItem;
                this.f178832b = c20563c;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FilterConditionsStatusItem filterConditionsStatusItem = this.f178831a;
                boolean z = filterConditionsStatusItem.selected;
                filterConditionsStatusItem.selected = !z;
                C20563c c20563c = this.f178832b;
                if (z) {
                    c20563c.f178834a.setTextColor(App.f16088e.getResources().getColor(c9c0.f80449q0));
                    this.f178832b.f178834a.setBackgroundDrawable(App.f16088e.getResources().getDrawable(dbc0.f86617U0));
                } else {
                    c20563c.f178834a.setTextColor(App.f16088e.getResources().getColor(c9c0.f80407c2));
                    this.f178832b.f178834a.setBackgroundDrawable(App.f16088e.getResources().getDrawable(dbc0.f87465u));
                }
                x20 x20Var = C20562b.this.f178830b;
                if (x20Var != null) {
                    x20Var.call();
                }
            }
        }

        public C20562b(List<FilterConditionsStatusItem> list) {
            this.f178829a = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public C20563c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return i == 0 ? new C20563c(LayoutInflater.from(viewGroup.getContext()).inflate(kec0.f125439H6, viewGroup, false)) : new C20563c(LayoutInflater.from(viewGroup.getContext()).inflate(kec0.f125455I6, viewGroup, false));
        }

        /* JADX INFO: renamed from: C */
        public void m195870C(x20 x20Var) {
            this.f178830b = x20Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<FilterConditionsStatusItem> list = this.f178829a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i < getItemCount() - 1 ? 0 : 1;
        }

        /* JADX INFO: renamed from: y */
        public List<FilterConditionsStatusItem> m195871y() {
            return this.f178829a;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull C20563c c20563c, int i) {
            FilterConditionsStatusItem filterConditionsStatusItem = this.f178829a.get(i);
            c20563c.f178834a.setText(filterConditionsStatusItem.value);
            boolean z = filterConditionsStatusItem.selected;
            VText_Bold vText_Bold = c20563c.f178834a;
            if (z) {
                vText_Bold.setTextColor(App.f16088e.getResources().getColor(c9c0.f80407c2));
                c20563c.f178834a.setBackgroundDrawable(App.f16088e.getResources().getDrawable(dbc0.f87465u));
            } else {
                vText_Bold.setTextColor(App.f16088e.getResources().getColor(c9c0.f80449q0));
                c20563c.f178834a.setBackgroundDrawable(App.f16088e.getResources().getDrawable(dbc0.f86617U0));
            }
            bnl0.m105509E0(c20563c.f178834a, new a(filterConditionsStatusItem, c20563c));
        }
    }

    /* JADX INFO: renamed from: l.ufw$c */
    public static class C20563c extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public VText_Bold f178834a;

        public C20563c(@NonNull View view) {
            super(view);
            this.f178834a = (VText_Bold) view.findViewById(adc0.f70656y6);
        }
    }

    /* JADX INFO: renamed from: l.ufw$d */
    public static class C20564d extends RecyclerView.Adapter<C20565e> {

        /* JADX INFO: renamed from: a */
        public String f178835a;

        /* JADX INFO: renamed from: b */
        public FilterConditionsCustomItems f178836b;

        /* JADX INFO: renamed from: c */
        public List<NewTags> f178837c;

        /* JADX INFO: renamed from: l.ufw$d$a */
        public class a implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C20562b f178838a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f178839b;

            public a(C20562b c20562b, int i) {
                this.f178838a = c20562b;
                this.f178839b = i;
            }

            @Override // p153l.x20
            public void call() {
                C20564d.this.m195875D(this.f178839b, this.f178838a.m195871y());
            }
        }

        public C20564d(String str, FilterConditionsCustomItems filterConditionsCustomItems, List<NewTags> list) {
            this.f178835a = str;
            this.f178836b = filterConditionsCustomItems;
            this.f178837c = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull C20565e c20565e, int i) {
            c20565e.f178841a.setText(ufw.f178814l[i]);
            C20562b c20562b = new C20562b(m195877z(i));
            c20565e.f178842b.setLayoutManager(new LinearLayoutManager(c20565e.itemView.getContext()));
            c20565e.f178842b.setAdapter(c20562b);
            c20562b.m195870C(new a(c20562b, i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C20565e onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new C20565e(LayoutInflater.from(viewGroup.getContext()).inflate(kec0.f125471J6, viewGroup, false));
        }

        /* JADX INFO: renamed from: D */
        public void m195875D(int i, List<FilterConditionsStatusItem> list) {
            if (i == 0) {
                this.f178836b.status = list;
                return;
            }
            if (i == 1) {
                this.f178836b.feature = list;
                return;
            }
            if (i == 2) {
                ArrayList arrayList = new ArrayList();
                for (FilterConditionsStatusItem filterConditionsStatusItem : list) {
                    if (filterConditionsStatusItem.selected) {
                        arrayList.add(String.valueOf(filterConditionsStatusItem.f21133id));
                    }
                }
                this.f178836b.selectedInterest = arrayList;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return ufw.f178814l.length;
        }

        /* JADX INFO: renamed from: y */
        public FilterConditionsCustomItems m195876y() {
            return this.f178836b;
        }

        /* JADX INFO: renamed from: z */
        public List<FilterConditionsStatusItem> m195877z(int i) {
            ArrayList arrayList = new ArrayList();
            if (i == 0) {
                return this.f178836b.status;
            }
            if (i == 1) {
                return this.f178836b.feature;
            }
            if (i == 2) {
                for (NewTags newTags : this.f178837c) {
                    FilterConditionsStatusItem filterConditionsStatusItemNew_ = FilterConditionsStatusItem.new_();
                    filterConditionsStatusItemNew_.f21133id = Integer.valueOf(newTags.f21199id).intValue();
                    filterConditionsStatusItemNew_.value = newTags.name;
                    filterConditionsStatusItemNew_.selected = this.f178836b.selectedInterest.contains(newTags.f21199id);
                    arrayList.add(filterConditionsStatusItemNew_);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l.ufw$e */
    public static class C20565e extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public VText_Bold f178841a;

        /* JADX INFO: renamed from: b */
        public RecyclerView f178842b;

        public C20565e(@NonNull View view) {
            super(view);
            this.f178841a = (VText_Bold) view.findViewById(adc0.f70409je);
            this.f178842b = (RecyclerView) view.findViewById(adc0.f70542rb);
        }
    }

    public ufw(Act act) {
        this.f178819e = act;
    }

    /* JADX INFO: renamed from: e */
    public static List<NewTags> m195865e() {
        Extensions extensions;
        Interest interest;
        if (gra.m131596L3()) {
            return new ArrayList();
        }
        Profile profile = CoreModule.f18264c.f20381e0.m116600p9().profile;
        if (profile == null || (extensions = profile.extensions) == null || (interest = extensions.interest) == null || jyb.m147479J(interest.tags)) {
            return new ArrayList();
        }
        List<NewTags> listM130460b = gj40.m130415o().m130431P(CoreModule.f18264c.f20381e0.m116600p9().profile.extensions.interest.tags).m130460b();
        return listM130460b.size() > 20 ? listM130460b.subList(0, 20) : listM130460b;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f178819e;
    }

    /* JADX INFO: renamed from: c */
    public View m195866c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vfw.m201189b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(tfw tfwVar) {
        this.f178820f = tfwVar;
    }

    /* JADX INFO: renamed from: f */
    public void m195868f(Bundle bundle) {
        this.f178815a.setLeftIconAsBack(this.f178819e);
        this.f178816b.setUserInputEnabled(false);
        Intent intent = getAct().getIntent();
        if (intent == null) {
            return;
        }
        this.f178823i = intent.getStringExtra("targetPage");
        FateRadarSearchConditions fateRadarSearchConditions = (FateRadarSearchConditions) intent.getSerializableExtra("data_key");
        this.f178825k = fateRadarSearchConditions;
        if (fateRadarSearchConditions == null) {
            this.f178819e.m48999H2();
            return;
        }
        this.f178824j = fateRadarSearchConditions.customItems;
        List<NewTags> listM195865e = m195865e();
        this.f178822h = listM195865e;
        C20564d c20564d = new C20564d(this.f178823i, this.f178824j, listM195865e);
        this.f178821g = c20564d;
        this.f178816b.setAdapter(c20564d);
        if (TextUtils.equals(this.f178823i, "select_status")) {
            this.f178816b.m4252j(0, false);
            this.f178817c.setText("下一步");
        } else if (TextUtils.equals(this.f178823i, "select_feature")) {
            this.f178816b.m4252j(1, false);
            int size = this.f178822h.size();
            VText vText = this.f178817c;
            if (size > 0) {
                vText.setText("下一步");
            } else {
                vText.setText("完成");
            }
        } else if (TextUtils.equals(this.f178823i, "select_selectedInterest")) {
            this.f178816b.m4252j(2, false);
            this.f178817c.setText("完成");
        }
        bnl0.m105509E0(this.f178817c, new ViewOnClickListenerC20561a());
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m195866c(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
