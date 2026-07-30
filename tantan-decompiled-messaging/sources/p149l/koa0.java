package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class koa0 extends xne {
    public koa0(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ int m146686W(LiteraturesComments literaturesComments, LiteraturesComments literaturesComments2) {
        return (int) (literaturesComments2.updatedTime - literaturesComments.updatedTime);
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ int m146690a0(List list, final LiteraturesComments literaturesComments, final LiteraturesComments literaturesComments2) {
        LiteraturesComments literaturesComments3 = (LiteraturesComments) vwb.m200346r(list, new w9j() { // from class: l.ioa0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiteraturesComments) obj).literatureID, literaturesComments.literatureID));
            }
        });
        LiteraturesComments literaturesComments4 = (LiteraturesComments) vwb.m200346r(list, new w9j() { // from class: l.joa0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiteraturesComments) obj).literatureID, literaturesComments2.literatureID));
            }
        });
        if (NullChecker.m81303a(literaturesComments3) && NullChecker.m81303a(literaturesComments4)) {
            return (int) (literaturesComments4.updatedTime - literaturesComments3.updatedTime);
        }
        return 0;
    }

    @Override // p149l.xne
    /* JADX INFO: renamed from: U */
    public void mo146691U() {
        if (vwb.m200296J(this.f193661F)) {
            return;
        }
        if (!mo52800O().mo51075P1()) {
            mo52800O().act().duringCreated(C22306c.just(BookMoviesDramasHelper.m59445l(CoreModule.m29931H().userId()))).subscribe(mkd0.m154955G(new e30() { // from class: l.eoa0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f92431a.m146692b0((List) obj);
                }
            }));
        }
        this.f193660E = BookMoviesDramasHelper.m59444k(this.f193661F);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m146692b0(final List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (final LiteraturesComments literaturesComments : this.f193661F) {
            if (NullChecker.m81303a((LiteraturesComments) vwb.m200346r(list, new w9j() { // from class: l.foa0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((LiteraturesComments) obj).literatureID, literaturesComments.literatureID));
                }
            }))) {
                arrayList.add(literaturesComments);
            } else {
                arrayList2.add(literaturesComments);
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: l.goa0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return koa0.m146690a0(list, (LiteraturesComments) obj, (LiteraturesComments) obj2);
            }
        });
        Collections.sort(arrayList2, new Comparator() { // from class: l.hoa0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return koa0.m146686W((LiteraturesComments) obj, (LiteraturesComments) obj2);
            }
        });
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.f193661F = arrayList3;
    }

    @Override // p149l.xne, p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f193664v.setTextSize(18.0f);
        this.f193664v.setTextColor(Color.parseColor("#e6000000"));
    }

    @Override // p149l.xne, p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        j760<List<Literatures>, List<LiteraturesComments>> j760VarMo51062H3 = mo52800O().mo51062H3();
        if (NullChecker.m81303a(j760VarMo51062H3)) {
            this.f193661F = j760VarMo51062H3.f116565b;
        }
        return (mo52800O().mo51119m0() || vwb.m200296J(this.f193661F)) ? false : true;
    }
}
