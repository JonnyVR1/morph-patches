package com.p051p1.mobile.putong.live.external.page.rights.list.model;

import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightHolderView;
import p153l.e9d0;
import p153l.xec0;

/* JADX INFO: loaded from: classes9.dex */
public class RightHolderModel extends e9d0<RightHolderView> {

    /* JADX INFO: renamed from: e */
    public HolderType f46858e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class HolderType {
        private static final /* synthetic */ HolderType[] $VALUES = $values();
        public static final HolderType ENTER_ROOM_EFFECT_HOLDER;
        public static final HolderType LIST_BOTTOM_HOLDER;

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.rights.list.model.RightHolderModel$HolderType$1 */
        public final enum C127381 extends HolderType {
            private C127381(String str, int i) {
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
        public final enum C127392 extends HolderType {
            private C127392(String str, int i) {
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
            LIST_BOTTOM_HOLDER = new C127381("LIST_BOTTOM_HOLDER", 0);
            ENTER_ROOM_EFFECT_HOLDER = new C127392("ENTER_ROOM_EFFECT_HOLDER", 1);
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
        this.f46858e = holderType;
        this.f92628c = holderType.getSpanSize();
    }

    /* JADX INFO: renamed from: H */
    public String m71746H() {
        return this.f46858e.getBgColor();
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo71749u(RightHolderView rightHolderView) {
        super.mo71749u(rightHolderView);
        rightHolderView.m71800b(this);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193883k1;
    }
}
