package com.p046p1.mobile.putong.live.external.page.rights.list.model;

import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightHolderView;
import p149l.b1d0;
import p149l.s6c0;

/* JADX INFO: loaded from: classes13.dex */
public class RightHolderModel extends b1d0<RightHolderView> {

    /* JADX INFO: renamed from: e */
    public HolderType f46010e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class HolderType {
        private static final /* synthetic */ HolderType[] $VALUES = $values();
        public static final HolderType ENTER_ROOM_EFFECT_HOLDER;
        public static final HolderType LIST_BOTTOM_HOLDER;

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.rights.list.model.RightHolderModel$HolderType$1 */
        public final enum C125751 extends HolderType {
            private C125751(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.external.page.rights.list.model.RightHolderModel.HolderType
            public String getBgColor() {
                return "#ffffff";
            }

            @Override // com.p1.mobile.putong.live.external.page.rights.list.model.RightHolderModel.HolderType
            public int getSpanSize() {
                return 2;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.rights.list.model.RightHolderModel$HolderType$2 */
        public final enum C125762 extends HolderType {
            private C125762(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.external.page.rights.list.model.RightHolderModel.HolderType
            public String getBgColor() {
                return "#f7f7f7";
            }

            @Override // com.p1.mobile.putong.live.external.page.rights.list.model.RightHolderModel.HolderType
            public int getSpanSize() {
                return 1;
            }
        }

        private static /* synthetic */ HolderType[] $values() {
            return new HolderType[]{LIST_BOTTOM_HOLDER, ENTER_ROOM_EFFECT_HOLDER};
        }

        static {
            LIST_BOTTOM_HOLDER = new C125751("LIST_BOTTOM_HOLDER", 0);
            ENTER_ROOM_EFFECT_HOLDER = new C125762("ENTER_ROOM_EFFECT_HOLDER", 1);
        }

        public static HolderType valueOf(String str) {
            return (HolderType) Enum.valueOf(HolderType.class, str);
        }

        public static HolderType[] values() {
            return (HolderType[]) $VALUES.clone();
        }

        public abstract String getBgColor();

        public abstract int getSpanSize();

        private HolderType(String str, int i) {
            super(str, i);
        }
    }

    public RightHolderModel(HolderType holderType) {
        this.f46010e = holderType;
        this.f72586c = holderType.getSpanSize();
    }

    /* JADX INFO: renamed from: H */
    public String m70563H() {
        return this.f46010e.getBgColor();
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo70566u(RightHolderView rightHolderView) {
        super.mo70566u(rightHolderView);
        rightHolderView.m70617b(this);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162769k1;
    }
}
