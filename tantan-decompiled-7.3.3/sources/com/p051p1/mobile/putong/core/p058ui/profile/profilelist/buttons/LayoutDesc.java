package com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons;

import com.p051p1.mobile.putong.live.base.data.BLiveChatJailedType;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class LayoutDesc {

    /* JADX INFO: renamed from: d */
    public static final LayoutDesc f34712d = ComboType.Like_SuperLike_Match.getLayoutDesc();

    /* JADX INFO: renamed from: b */
    public ComboType f34714b;

    /* JADX INFO: renamed from: a */
    public String f34713a = "unknown";

    /* JADX INFO: renamed from: c */
    public final HashMap<ProfileButton.ProfileButtonType, Boolean> f34715c = new HashMap<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static class ComboType {
        private static final /* synthetic */ ComboType[] $VALUES = $values();
        public static final ComboType Chat_Single;
        public static final ComboType Chat_VideoChat;
        public static final ComboType CityC;
        public static final ComboType Dislike_Like_SuperLike;
        public static final ComboType Dislike_Like_SuperLike_Match;
        public static final ComboType Explore_Single;
        public static final ComboType Like_Single;
        public static final ComboType Like_SuperLike_Match;
        public static final ComboType Match;
        public static final ComboType None;
        public static final ComboType Recovery_Single;
        public static final ComboType SuperLike;
        public static final ComboType SuperLike_Match;
        public static final ComboType SuperLike_VideoChat;
        public static final ComboType VideoChat;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$1 */
        public final enum C88701 extends ComboType {
            private C88701(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                ProfileButton.ProfileButtonType profileButtonType = ProfileButton.ProfileButtonType.Like;
                Boolean bool = Boolean.TRUE;
                layoutDesc.m53574c(profileButtonType, bool);
                layoutDesc.m53574c(ProfileButton.ProfileButtonType.Dislike, bool);
                layoutDesc.m53574c(ProfileButton.ProfileButtonType.SuperLike, bool);
                layoutDesc.m53574c(ProfileButton.ProfileButtonType.OneKeyMatch, bool);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$10 */
        public final enum C887110 extends ComboType {
            private C887110(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                layoutDesc.m53574c(ProfileButton.ProfileButtonType.CityGreet, Boolean.TRUE);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$11 */
        public final enum C887211 extends ComboType {
            private C887211(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                layoutDesc.m53574c(ProfileButton.ProfileButtonType.Chat, Boolean.TRUE);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$12 */
        public final enum C887312 extends ComboType {
            private C887312(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                layoutDesc.m53574c(ProfileButton.ProfileButtonType.Recovery, Boolean.TRUE);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$13 */
        public final enum C887413 extends ComboType {
            private C887413(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = super.getLayoutDesc();
                layoutDesc.m53574c(ProfileButton.ProfileButtonType.Like, Boolean.TRUE);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$14 */
        public final enum C887514 extends ComboType {
            private C887514(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                return super.getLayoutDesc();
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$15 */
        public final enum C887615 extends ComboType {
            private C887615(String str, int i) {
                super(str, i);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$2 */
        public final enum C88772 extends ComboType {
            private C88772(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                ProfileButton.ProfileButtonType profileButtonType = ProfileButton.ProfileButtonType.Like;
                Boolean bool = Boolean.TRUE;
                layoutDesc.m53574c(profileButtonType, bool);
                layoutDesc.m53574c(ProfileButton.ProfileButtonType.SuperLike, bool);
                layoutDesc.m53574c(ProfileButton.ProfileButtonType.OneKeyMatch, bool);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$3 */
        public final enum C88783 extends ComboType {
            private C88783(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                ProfileButton.ProfileButtonType profileButtonType = ProfileButton.ProfileButtonType.SuperLike;
                Boolean bool = Boolean.TRUE;
                layoutDesc.m53574c(profileButtonType, bool);
                layoutDesc.m53574c(ProfileButton.ProfileButtonType.OneKeyMatch, bool);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$4 */
        public final enum C88794 extends ComboType {
            private C88794(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                layoutDesc.m53574c(ProfileButton.ProfileButtonType.SuperLike, Boolean.TRUE);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$5 */
        public final enum C88805 extends ComboType {
            private C88805(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                layoutDesc.m53574c(ProfileButton.ProfileButtonType.OneKeyMatch, Boolean.TRUE);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$6 */
        public final enum C88816 extends ComboType {
            private C88816(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                ProfileButton.ProfileButtonType profileButtonType = ProfileButton.ProfileButtonType.Like;
                Boolean bool = Boolean.TRUE;
                layoutDesc.m53574c(profileButtonType, bool);
                layoutDesc.m53574c(ProfileButton.ProfileButtonType.Dislike, bool);
                layoutDesc.m53574c(ProfileButton.ProfileButtonType.SuperLike, bool);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$7 */
        public final enum C88827 extends ComboType {
            private C88827(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                ProfileButton.ProfileButtonType profileButtonType = ProfileButton.ProfileButtonType.SuperLike;
                Boolean bool = Boolean.TRUE;
                layoutDesc.m53574c(profileButtonType, bool);
                layoutDesc.m53574c(ProfileButton.ProfileButtonType.VideoChat, bool);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$8 */
        public final enum C88838 extends ComboType {
            private C88838(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                ProfileButton.ProfileButtonType profileButtonType = ProfileButton.ProfileButtonType.Chat;
                Boolean bool = Boolean.TRUE;
                layoutDesc.m53574c(profileButtonType, bool);
                layoutDesc.m53574c(ProfileButton.ProfileButtonType.VideoChat, bool);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$9 */
        public final enum C88849 extends ComboType {
            private C88849(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                layoutDesc.m53574c(ProfileButton.ProfileButtonType.VideoChat, Boolean.TRUE);
                return layoutDesc;
            }
        }

        private static /* synthetic */ ComboType[] $values() {
            return new ComboType[]{Dislike_Like_SuperLike_Match, Like_SuperLike_Match, SuperLike_Match, SuperLike, Match, Dislike_Like_SuperLike, SuperLike_VideoChat, Chat_VideoChat, VideoChat, CityC, Chat_Single, Recovery_Single, Like_Single, Explore_Single, None};
        }

        static {
            Dislike_Like_SuperLike_Match = new C88701("Dislike_Like_SuperLike_Match", 0);
            Like_SuperLike_Match = new C88772("Like_SuperLike_Match", 1);
            SuperLike_Match = new C88783("SuperLike_Match", 2);
            SuperLike = new C88794("SuperLike", 3);
            Match = new C88805("Match", 4);
            Dislike_Like_SuperLike = new C88816("Dislike_Like_SuperLike", 5);
            SuperLike_VideoChat = new C88827("SuperLike_VideoChat", 6);
            Chat_VideoChat = new C88838("Chat_VideoChat", 7);
            VideoChat = new C88849("VideoChat", 8);
            CityC = new C887110("CityC", 9);
            Chat_Single = new C887211("Chat_Single", 10);
            Recovery_Single = new C887312("Recovery_Single", 11);
            Like_Single = new C887413("Like_Single", 12);
            Explore_Single = new C887514("Explore_Single", 13);
            None = new C887615(BLiveChatJailedType.None, 14);
        }

        public static ComboType valueOf(String str) {
            return (ComboType) Enum.valueOf(ComboType.class, str);
        }

        public static ComboType[] values() {
            return (ComboType[]) $VALUES.clone();
        }

        public LayoutDesc getLayoutDesc() {
            return new LayoutDesc(this);
        }

        private ComboType(String str, int i) {
            super(str, i);
        }
    }

    public LayoutDesc(ComboType comboType) {
        this.f34714b = comboType;
    }

    /* JADX INFO: renamed from: a */
    public ComboType m53572a() {
        return this.f34714b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m53573b(ProfileButton.ProfileButtonType profileButtonType) {
        return this.f34715c.containsKey(profileButtonType) && Boolean.TRUE.equals(this.f34715c.get(profileButtonType));
    }

    /* JADX INFO: renamed from: c */
    public void m53574c(ProfileButton.ProfileButtonType profileButtonType, Boolean bool) {
        this.f34715c.put(profileButtonType, bool);
    }

    public String toString() {
        return "LayoutDesc{source='" + this.f34713a + "', comboType=" + this.f34714b + ", layoutDesc=" + this.f34715c + '}';
    }
}
