package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.FateRadarSearchConditions;
import com.p046p1.mobile.putong.core.data.FilterConditionsCustomItems;
import com.p046p1.mobile.putong.core.data.FilterConditionsStatusItem;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Interest;
import com.p046p1.mobile.putong.data.Profile;
import java.util.ArrayList;
import java.util.List;
import p147v.VProgressBar;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class wdw implements s7m<vdw> {

    /* JADX INFO: renamed from: l */
    public static final String[] f185864l = {"对方状态（多选）", "你在意的特质（多选）", "兴趣爱好（多选）"};

    /* JADX INFO: renamed from: a */
    public VNavigationBar f185865a;

    /* JADX INFO: renamed from: b */
    public ViewPager2 f185866b;

    /* JADX INFO: renamed from: c */
    public VText f185867c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f185868d;

    /* JADX INFO: renamed from: e */
    public final Act f185869e;

    /* JADX INFO: renamed from: f */
    public vdw f185870f;

    /* JADX INFO: renamed from: g */
    public C20858d f185871g;

    /* JADX INFO: renamed from: h */
    public List<NewTags> f185872h;

    /* JADX INFO: renamed from: i */
    public String f185873i;

    /* JADX INFO: renamed from: j */
    public FilterConditionsCustomItems f185874j;

    /* JADX INFO: renamed from: k */
    public FateRadarSearchConditions f185875k;

    /* JADX INFO: renamed from: l.wdw$a */
    public class ViewOnClickListenerC20855a implements View.OnClickListener {

        /* JADX INFO: renamed from: l.wdw$a$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f185877a;

            public a(int i) {
                this.f185877a = i;
            }

            @Override // p149l.d30
            public void call() {
                int i = this.f185877a;
                if (i == 0) {
                    int size = wdw.this.f185872h.size();
                    ViewOnClickListenerC20855a viewOnClickListenerC20855a = ViewOnClickListenerC20855a.this;
                    if (size > 0) {
                        wdw.this.f185867c.setText("下一步");
                    } else {
                        wdw.this.f185867c.setText("完成");
                    }
                    wdw.this.f185866b.setCurrentItem(this.f185877a + 1);
                    return;
                }
                if (i != 1) {
                    if (i == 2) {
                        wdw.this.f185869e.m47815F2();
                    }
                } else {
                    int size2 = wdw.this.f185872h.size();
                    ViewOnClickListenerC20855a viewOnClickListenerC20855a2 = ViewOnClickListenerC20855a.this;
                    if (size2 > 0) {
                        wdw.this.f185866b.setCurrentItem(this.f185877a + 1);
                    } else {
                        wdw.this.f185869e.m47815F2();
                    }
                    wdw.this.f185867c.setText("完成");
                }
            }
        }

        public ViewOnClickListenerC20855a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int currentItem = wdw.this.f185866b.getCurrentItem();
            wdw wdwVar = wdw.this;
            wdwVar.f185875k.customItems = wdwVar.f185871g.m202808y();
            wdw.this.f185870f.m198101i0(wdw.this.f185875k, new a(currentItem));
        }
    }

    /* JADX INFO: renamed from: l.wdw$b */
    public static class C20856b extends RecyclerView.Adapter<C20857c> {

        /* JADX INFO: renamed from: a */
        public List<FilterConditionsStatusItem> f185879a;

        /* JADX INFO: renamed from: b */
        public d30 f185880b;

        /* JADX INFO: renamed from: l.wdw$b$a */
        public class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ FilterConditionsStatusItem f185881a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C20857c f185882b;

            public a(FilterConditionsStatusItem filterConditionsStatusItem, C20857c c20857c) {
                this.f185881a = filterConditionsStatusItem;
                this.f185882b = c20857c;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FilterConditionsStatusItem filterConditionsStatusItem = this.f185881a;
                boolean z = filterConditionsStatusItem.selected;
                filterConditionsStatusItem.selected = !z;
                C20857c c20857c = this.f185882b;
                if (z) {
                    c20857c.f185884a.setTextColor(App.f15369e.getResources().getColor(w0c0.f183876p0));
                    this.f185882b.f185884a.setBackgroundDrawable(App.f15369e.getResources().getDrawable(x2c0.f189749T0));
                } else {
                    c20857c.f185884a.setTextColor(App.f15369e.getResources().getColor(w0c0.f183834b2));
                    this.f185882b.f185884a.setBackgroundDrawable(App.f15369e.getResources().getDrawable(x2c0.f190570t));
                }
                d30 d30Var = C20856b.this.f185880b;
                if (d30Var != null) {
                    d30Var.call();
                }
            }
        }

        public C20856b(List<FilterConditionsStatusItem> list) {
            this.f185879a = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public C20857c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return i == 0 ? new C20857c(LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f95369G6, viewGroup, false)) : new C20857c(LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f95385H6, viewGroup, false));
        }

        /* JADX INFO: renamed from: C */
        public void m202802C(d30 d30Var) {
            this.f185880b = d30Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<FilterConditionsStatusItem> list = this.f185879a;
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
        public List<FilterConditionsStatusItem> m202803y() {
            return this.f185879a;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull C20857c c20857c, int i) {
            FilterConditionsStatusItem filterConditionsStatusItem = this.f185879a.get(i);
            c20857c.f185884a.setText(filterConditionsStatusItem.value);
            boolean z = filterConditionsStatusItem.selected;
            VText_Bold vText_Bold = c20857c.f185884a;
            if (z) {
                vText_Bold.setTextColor(App.f15369e.getResources().getColor(w0c0.f183834b2));
                c20857c.f185884a.setBackgroundDrawable(App.f15369e.getResources().getDrawable(x2c0.f190570t));
            } else {
                vText_Bold.setTextColor(App.f15369e.getResources().getColor(w0c0.f183876p0));
                c20857c.f185884a.setBackgroundDrawable(App.f15369e.getResources().getDrawable(x2c0.f189749T0));
            }
            xdl0.m208329E0(c20857c.f185884a, new a(filterConditionsStatusItem, c20857c));
        }
    }

    /* JADX INFO: renamed from: l.wdw$c */
    public static class C20857c extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public VText_Bold f185884a;

        public C20857c(@NonNull View view) {
            super(view);
            this.f185884a = (VText_Bold) view.findViewById(u4c0.f174531w6);
        }
    }

    /* JADX INFO: renamed from: l.wdw$d */
    public static class C20858d extends RecyclerView.Adapter<C20859e> {

        /* JADX INFO: renamed from: a */
        public String f185885a;

        /* JADX INFO: renamed from: b */
        public FilterConditionsCustomItems f185886b;

        /* JADX INFO: renamed from: c */
        public List<NewTags> f185887c;

        /* JADX INFO: renamed from: l.wdw$d$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C20856b f185888a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f185889b;

            public a(C20856b c20856b, int i) {
                this.f185888a = c20856b;
                this.f185889b = i;
            }

            @Override // p149l.d30
            public void call() {
                C20858d.this.m202807D(this.f185889b, this.f185888a.m202803y());
            }
        }

        public C20858d(String str, FilterConditionsCustomItems filterConditionsCustomItems, List<NewTags> list) {
            this.f185885a = str;
            this.f185886b = filterConditionsCustomItems;
            this.f185887c = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull C20859e c20859e, int i) {
            c20859e.f185891a.setText(wdw.f185864l[i]);
            C20856b c20856b = new C20856b(m202809z(i));
            c20859e.f185892b.setLayoutManager(new LinearLayoutManager(c20859e.itemView.getContext()));
            c20859e.f185892b.setAdapter(c20856b);
            c20856b.m202802C(new a(c20856b, i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C20859e onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new C20859e(LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f95401I6, viewGroup, false));
        }

        /* JADX INFO: renamed from: D */
        public void m202807D(int i, List<FilterConditionsStatusItem> list) {
            if (i == 0) {
                this.f185886b.status = list;
                return;
            }
            if (i == 1) {
                this.f185886b.feature = list;
                return;
            }
            if (i == 2) {
                ArrayList arrayList = new ArrayList();
                for (FilterConditionsStatusItem filterConditionsStatusItem : list) {
                    if (filterConditionsStatusItem.selected) {
                        arrayList.add(String.valueOf(filterConditionsStatusItem.f20391id));
                    }
                }
                this.f185886b.selectedInterest = arrayList;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return wdw.f185864l.length;
        }

        /* JADX INFO: renamed from: y */
        public FilterConditionsCustomItems m202808y() {
            return this.f185886b;
        }

        /* JADX INFO: renamed from: z */
        public List<FilterConditionsStatusItem> m202809z(int i) {
            ArrayList arrayList = new ArrayList();
            if (i == 0) {
                return this.f185886b.status;
            }
            if (i == 1) {
                return this.f185886b.feature;
            }
            if (i == 2) {
                for (NewTags newTags : this.f185887c) {
                    FilterConditionsStatusItem filterConditionsStatusItemNew_ = FilterConditionsStatusItem.new_();
                    filterConditionsStatusItemNew_.f20391id = Integer.valueOf(newTags.f20457id).intValue();
                    filterConditionsStatusItemNew_.value = newTags.name;
                    filterConditionsStatusItemNew_.selected = this.f185886b.selectedInterest.contains(newTags.f20457id);
                    arrayList.add(filterConditionsStatusItemNew_);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l.wdw$e */
    public static class C20859e extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public VText_Bold f185891a;

        /* JADX INFO: renamed from: b */
        public RecyclerView f185892b;

        public C20859e(@NonNull View view) {
            super(view);
            this.f185891a = (VText_Bold) view.findViewById(u4c0.f174268ge);
            this.f185892b = (RecyclerView) view.findViewById(u4c0.f174417pb);
        }
    }

    public wdw(Act act) {
        this.f185869e = act;
    }

    /* JADX INFO: renamed from: e */
    public static List<NewTags> m202797e() {
        Extensions extensions;
        Interest interest;
        if (upa.m194665L3()) {
            return new ArrayList();
        }
        Profile profile = CoreModule.f17545c.f19639e0.m169527p9().profile;
        if (profile == null || (extensions = profile.extensions) == null || (interest = extensions.interest) == null || vwb.m200296J(interest.tags)) {
            return new ArrayList();
        }
        List<NewTags> listM182847b = sa40.m182802o().m182818P(CoreModule.f17545c.f19639e0.m169527p9().profile.extensions.interest.tags).m182847b();
        return listM182847b.size() > 20 ? listM182847b.subList(0, 20) : listM182847b;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f185869e;
    }

    /* JADX INFO: renamed from: c */
    public View m202798c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xdw.m208430b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(vdw vdwVar) {
        this.f185870f = vdwVar;
    }

    /* JADX INFO: renamed from: f */
    public void m202800f(Bundle bundle) {
        this.f185865a.setLeftIconAsBack(this.f185869e);
        this.f185866b.setUserInputEnabled(false);
        Intent intent = getAct().getIntent();
        if (intent == null) {
            return;
        }
        this.f185873i = intent.getStringExtra("targetPage");
        FateRadarSearchConditions fateRadarSearchConditions = (FateRadarSearchConditions) intent.getSerializableExtra("data_key");
        this.f185875k = fateRadarSearchConditions;
        if (fateRadarSearchConditions == null) {
            this.f185869e.m47815F2();
            return;
        }
        this.f185874j = fateRadarSearchConditions.customItems;
        List<NewTags> listM202797e = m202797e();
        this.f185872h = listM202797e;
        C20858d c20858d = new C20858d(this.f185873i, this.f185874j, listM202797e);
        this.f185871g = c20858d;
        this.f185866b.setAdapter(c20858d);
        if (TextUtils.equals(this.f185873i, "select_status")) {
            this.f185866b.m4250j(0, false);
            this.f185867c.setText("下一步");
        } else if (TextUtils.equals(this.f185873i, "select_feature")) {
            this.f185866b.m4250j(1, false);
            int size = this.f185872h.size();
            VText vText = this.f185867c;
            if (size > 0) {
                vText.setText("下一步");
            } else {
                vText.setText("完成");
            }
        } else if (TextUtils.equals(this.f185873i, "select_selectedInterest")) {
            this.f185866b.m4250j(2, false);
            this.f185867c.setText("完成");
        }
        xdl0.m208329E0(this.f185867c, new ViewOnClickListenerC20855a());
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m202798c(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
