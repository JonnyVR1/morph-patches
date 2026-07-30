package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.external.intl.feedback.bean.IntlFeedbackPageData;
import com.p051p1.mobile.putong.live.external.intl.feedback.item.IntlFeedbackQuestionCategoryItemView;
import com.p051p1.mobile.putong.live.external.intl.feedback.item.IntlFeedbackQuestionItemView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m88121d2 = {"Ll/jfn;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "<init>", "()V", "", "Lcom/p1/mobile/putong/live/external/intl/feedback/bean/IntlFeedbackPageData$GroupsDTO;", "groups", "Lkotlin/Function1;", "", "", "lastQuestionClickFunc", "g0", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "b", "a", "c", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class jfn extends LiveBaseAdapter {

    /* JADX INFO: renamed from: l.jfn$a */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/jfn$a;", "Ll/d3q;", "Lcom/p1/mobile/putong/live/external/intl/feedback/item/IntlFeedbackQuestionCategoryItemView;", "", "title", "<init>", "(Ljava/lang/String;)V", "", "o", "()I", "itemView", "", "H", "(Lcom/p1/mobile/putong/live/external/intl/feedback/item/IntlFeedbackQuestionCategoryItemView;)V", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17941a extends d3q<IntlFeedbackQuestionCategoryItemView> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String title;

        public C17941a(@NotNull String str) {
            str.getClass();
            this.title = str;
        }

        @Override // p153l.d3q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void mo71749u(@Nullable IntlFeedbackQuestionCategoryItemView itemView) {
            VText vText;
            super.mo71749u(itemView);
            if (itemView == null || (vText = itemView.get_question_category()) == null) {
                return;
            }
            vText.setText(this.title);
        }

        @Override // p153l.d3q
        /* JADX INFO: renamed from: o */
        public int mo71748o() {
            return xec0.f193763A;
        }
    }

    /* JADX INFO: renamed from: l.jfn$b */
    @Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR0\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Ll/jfn$b;", "Ll/d3q;", "Lcom/p1/mobile/putong/live/external/intl/feedback/item/IntlFeedbackQuestionItemView;", "Lcom/p1/mobile/putong/live/external/intl/feedback/bean/IntlFeedbackPageData$GroupsDTO$FaqListDTO;", "question", "<init>", "(Lcom/p1/mobile/putong/live/external/intl/feedback/bean/IntlFeedbackPageData$GroupsDTO$FaqListDTO;)V", "", "o", "()I", "itemView", "", "H", "(Lcom/p1/mobile/putong/live/external/intl/feedback/item/IntlFeedbackQuestionItemView;)V", "a", "Lcom/p1/mobile/putong/live/external/intl/feedback/bean/IntlFeedbackPageData$GroupsDTO$FaqListDTO;", "Lkotlin/Function1;", "", "b", "Lkotlin/jvm/functions/Function1;", "getFunction", "()Lkotlin/jvm/functions/Function1;", "I", "(Lkotlin/jvm/functions/Function1;)V", "function", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17942b extends d3q<IntlFeedbackQuestionItemView> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final IntlFeedbackPageData.GroupsDTO.FaqListDTO question;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public Function1<? super Boolean, Unit> function;

        public C17942b(@NotNull IntlFeedbackPageData.GroupsDTO.FaqListDTO faqListDTO) {
            faqListDTO.getClass();
            this.question = faqListDTO;
        }

        @Override // p153l.d3q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void mo71749u(@Nullable IntlFeedbackQuestionItemView itemView) {
            super.mo71749u(itemView);
            if (itemView != null) {
                itemView.m71139R(this.question, this.function);
            }
        }

        /* JADX INFO: renamed from: I */
        public final void m144696I(@Nullable Function1<? super Boolean, Unit> function1) {
            this.function = function1;
        }

        @Override // p153l.d3q
        /* JADX INFO: renamed from: o */
        public int mo71748o() {
            return xec0.f193766B;
        }
    }

    /* JADX INFO: renamed from: l.jfn$c */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/jfn$c;", "Ll/d3q;", "Landroid/view/View;", "", "isVisible", "<init>", "(Z)V", "", "o", "()I", "itemView", "", "u", "(Landroid/view/View;)V", "a", "Z", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17943c extends d3q<View> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final boolean isVisible;

        public C17943c(boolean z) {
            this.isVisible = z;
        }

        @Override // p153l.d3q
        /* JADX INFO: renamed from: o */
        public int mo71748o() {
            return xec0.f193772D;
        }

        @Override // p153l.d3q
        /* JADX INFO: renamed from: u */
        public void mo71749u(@Nullable View itemView) {
            super.mo71749u(itemView);
            if (itemView != null) {
                itemView.setVisibility(this.isVisible ? 0 : 4);
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m144691f0(final List list, List list2, Function1 function1, IntlFeedbackPageData.GroupsDTO groupsDTO) {
        String title = groupsDTO.getTitle();
        title.getClass();
        list.add(new C17941a(title));
        jyb.m147537z(groupsDTO.getFaqList(), new y20() { // from class: l.ifn
            @Override // p153l.y20
            public final void call(Object obj) {
                jfn.m144692h0(list, (IntlFeedbackPageData.GroupsDTO.FaqListDTO) obj);
            }
        });
        if (list2.indexOf(groupsDTO) != list2.size() - 1) {
            list.add(new C17943c(true));
        } else if (CollectionsKt.last(list) instanceof C17942b) {
            Object objLast = CollectionsKt.last((List<? extends Object>) list);
            objLast.getClass();
            ((C17942b) objLast).m144696I(function1);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m144692h0(List list, IntlFeedbackPageData.GroupsDTO.FaqListDTO faqListDTO) {
        faqListDTO.getClass();
        C17942b c17942b = new C17942b(faqListDTO);
        c17942b.m144696I(null);
        list.add(c17942b);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m144693g0(@NotNull final List<IntlFeedbackPageData.GroupsDTO> groups, @NotNull final Function1<? super Boolean, Unit> lastQuestionClickFunc) {
        groups.getClass();
        lastQuestionClickFunc.getClass();
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(groups, new y20() { // from class: l.hfn
            @Override // p153l.y20
            public final void call(Object obj) {
                jfn.m144691f0(arrayList, groups, lastQuestionClickFunc, (IntlFeedbackPageData.GroupsDTO) obj);
            }
        });
        arrayList.add(new C17943c(false));
        m68554Z(arrayList);
    }
}
