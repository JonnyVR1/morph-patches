package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B?\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR(\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R(\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006\""}, m88121d2 = {"Ll/j2o0;", "Ll/cf60;", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "tabViewList", "", "titleList", "<init>", "(Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "", "getCount", "()I", OMSTemplateModeType.view, "", "o", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "position", "", "getPageTitle", "(I)Ljava/lang/CharSequence;", "Landroid/view/ViewGroup;", "container", "instantiateItem", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "object", "", "destroyItem", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "a", "Ljava/util/ArrayList;", "b", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class j2o0 extends cf60 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final ArrayList<View> tabViewList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final ArrayList<String> titleList;

    public j2o0(@Nullable ArrayList<View> arrayList, @Nullable ArrayList<String> arrayList2) {
        this.tabViewList = arrayList;
        this.titleList = arrayList2;
    }

    @Override // p153l.cf60
    public void destroyItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
        container.getClass();
        object.getClass();
        container.removeView((View) object);
    }

    @Override // p153l.cf60
    public int getCount() {
        ArrayList<View> arrayList = this.tabViewList;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // p153l.cf60
    @Nullable
    public CharSequence getPageTitle(int position) {
        ArrayList<String> arrayList = this.titleList;
        arrayList.getClass();
        return arrayList.get(position);
    }

    @Override // p153l.cf60
    @NotNull
    public Object instantiateItem(@NotNull ViewGroup container, int position) {
        container.getClass();
        ArrayList<View> arrayList = this.tabViewList;
        arrayList.getClass();
        View view = arrayList.get(position);
        view.getClass();
        View view2 = view;
        container.addView(view2);
        return view2;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NotNull View view, @NotNull Object o) {
        view.getClass();
        o.getClass();
        return view == o;
    }
}
