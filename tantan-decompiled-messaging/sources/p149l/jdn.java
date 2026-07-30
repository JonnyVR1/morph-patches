package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.external.intl.feedback.bean.IntlFeedbackPageData;
import com.p046p1.mobile.putong.live.external.intl.feedback.item.IntlFeedbackQuestionCategoryItemView;
import com.p046p1.mobile.putong.live.external.intl.feedback.item.IntlFeedbackQuestionItemView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m87232d2 = {"Ll/jdn;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "<init>", "()V", "", "Lcom/p1/mobile/putong/live/external/intl/feedback/bean/IntlFeedbackPageData$GroupsDTO;", "groups", "Lkotlin/Function1;", "", "", "lastQuestionClickFunc", "g0", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "b", "a", "c", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class jdn extends LiveBaseAdapter {

    /* JADX INFO: renamed from: l.jdn$a */
    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Ll/jdn$a;", "Ll/d1q;", "Lcom/p1/mobile/putong/live/external/intl/feedback/item/IntlFeedbackQuestionCategoryItemView;", "", "title", "<init>", "(Ljava/lang/String;)V", "", "o", "()I", "itemView", "", "H", "(Lcom/p1/mobile/putong/live/external/intl/feedback/item/IntlFeedbackQuestionCategoryItemView;)V", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17752a extends d1q<IntlFeedbackQuestionCategoryItemView> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String title;

        public C17752a(@NotNull String str) {
            str.getClass();
            this.title = str;
        }

        @Override // p149l.d1q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void mo70566u(@Nullable IntlFeedbackQuestionCategoryItemView itemView) {
            VText vText;
            super.mo70566u(itemView);
            if (itemView == null || (vText = itemView.get_question_category()) == null) {
                return;
            }
            vText.setText(this.title);
        }

        @Override // p149l.d1q
        /* JADX INFO: renamed from: o */
        public int mo70565o() {
            return s6c0.f162649A;
        }
    }

    /* JADX INFO: renamed from: l.jdn$b */
    @Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR0\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Ll/jdn$b;", "Ll/d1q;", "Lcom/p1/mobile/putong/live/external/intl/feedback/item/IntlFeedbackQuestionItemView;", "Lcom/p1/mobile/putong/live/external/intl/feedback/bean/IntlFeedbackPageData$GroupsDTO$FaqListDTO;", "question", "<init>", "(Lcom/p1/mobile/putong/live/external/intl/feedback/bean/IntlFeedbackPageData$GroupsDTO$FaqListDTO;)V", "", "o", "()I", "itemView", "", "H", "(Lcom/p1/mobile/putong/live/external/intl/feedback/item/IntlFeedbackQuestionItemView;)V", "a", "Lcom/p1/mobile/putong/live/external/intl/feedback/bean/IntlFeedbackPageData$GroupsDTO$FaqListDTO;", "Lkotlin/Function1;", "", "b", "Lkotlin/jvm/functions/Function1;", "getFunction", "()Lkotlin/jvm/functions/Function1;", "I", "(Lkotlin/jvm/functions/Function1;)V", "function", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17753b extends d1q<IntlFeedbackQuestionItemView> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final IntlFeedbackPageData.GroupsDTO.FaqListDTO question;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public Function1<? super Boolean, Unit> function;

        public C17753b(@NotNull IntlFeedbackPageData.GroupsDTO.FaqListDTO faqListDTO) {
            faqListDTO.getClass();
            this.question = faqListDTO;
        }

        @Override // p149l.d1q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void mo70566u(@Nullable IntlFeedbackQuestionItemView itemView) {
            super.mo70566u(itemView);
            if (itemView != null) {
                itemView.m69956R(this.question, this.function);
            }
        }

        /* JADX INFO: renamed from: I */
        public final void m141054I(@Nullable Function1<? super Boolean, Unit> function1) {
            this.function = function1;
        }

        @Override // p149l.d1q
        /* JADX INFO: renamed from: o */
        public int mo70565o() {
            return s6c0.f162652B;
        }
    }

    /* JADX INFO: renamed from: l.jdn$c */
    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Ll/jdn$c;", "Ll/d1q;", "Landroid/view/View;", "", "isVisible", "<init>", "(Z)V", "", "o", "()I", "itemView", "", "u", "(Landroid/view/View;)V", "a", "Z", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17754c extends d1q<View> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final boolean isVisible;

        public C17754c(boolean z) {
            this.isVisible = z;
        }

        @Override // p149l.d1q
        /* JADX INFO: renamed from: o */
        public int mo70565o() {
            return s6c0.f162658D;
        }

        @Override // p149l.d1q
        /* JADX INFO: renamed from: u */
        public void mo70566u(@Nullable View itemView) {
            super.mo70566u(itemView);
            if (itemView != null) {
                itemView.setVisibility(this.isVisible ? 0 : 4);
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m141049f0(final List list, List list2, Function1 function1, IntlFeedbackPageData.GroupsDTO groupsDTO) {
        String title = groupsDTO.getTitle();
        title.getClass();
        list.add(new C17752a(title));
        vwb.m200354z(groupsDTO.getFaqList(), new e30() { // from class: l.idn
            @Override // p149l.e30
            public final void call(Object obj) {
                jdn.m141050h0(list, (IntlFeedbackPageData.GroupsDTO.FaqListDTO) obj);
            }
        });
        if (list2.indexOf(groupsDTO) != list2.size() - 1) {
            list.add(new C17754c(true));
        } else if (CollectionsKt.last(list) instanceof C17753b) {
            Object objLast = CollectionsKt.last((List<? extends Object>) list);
            objLast.getClass();
            ((C17753b) objLast).m141054I(function1);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m141050h0(List list, IntlFeedbackPageData.GroupsDTO.FaqListDTO faqListDTO) {
        faqListDTO.getClass();
        C17753b c17753b = new C17753b(faqListDTO);
        c17753b.m141054I(null);
        list.add(c17753b);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m141051g0(@NotNull final List<IntlFeedbackPageData.GroupsDTO> groups, @NotNull final Function1<? super Boolean, Unit> lastQuestionClickFunc) {
        groups.getClass();
        lastQuestionClickFunc.getClass();
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(groups, new e30() { // from class: l.hdn
            @Override // p149l.e30
            public final void call(Object obj) {
                jdn.m141049f0(arrayList, groups, lastQuestionClickFunc, (IntlFeedbackPageData.GroupsDTO) obj);
            }
        });
        arrayList.add(new C17754c(false));
        m67371Z(arrayList);
    }
}
