package com.p051p1.mobile.putong.core.p058ui.onlinematch;

import com.p051p1.mobile.putong.core.data.Bubbles;
import com.p051p1.mobile.putong.core.data.ChatRoomBubble;
import com.p051p1.mobile.putong.data.BannerLoc;
import com.p051p1.mobile.putong.data.Emotion;
import p153l.uf3;

/* JADX INFO: loaded from: classes4.dex */
public class SquareDataWrapper extends uf3 {

    /* JADX INFO: renamed from: e */
    public Type f33508e = Type.momentState;

    /* JADX INFO: renamed from: f */
    public Bubbles f33509f;

    /* JADX INFO: renamed from: g */
    public OnlineMatchPushUser f33510g;

    /* JADX INFO: renamed from: h */
    public ChatRoomBubble f33511h;

    /* JADX INFO: renamed from: i */
    public Emotion f33512i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static class Type {
        private static final /* synthetic */ Type[] $VALUES = $values();
        public static final Type chatRoom;
        public static final Type momentChatRoom;
        public static final Type momentState;
        public static final Type quickChat;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper$Type$1 */
        public final enum C87681 extends Type {
            private C87681(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper.Type
            public int getType() {
                return 0;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper$Type$2 */
        public final enum C87692 extends Type {
            private C87692(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper.Type
            public String getStateType() {
                return BannerLoc.popup;
            }

            @Override // com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper.Type
            public int getType() {
                return 1;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper$Type$3 */
        public final enum C87703 extends Type {
            private C87703(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper.Type
            public String getStateType() {
                return "audio";
            }

            @Override // com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper.Type
            public int getType() {
                return 2;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper$Type$4 */
        public final enum C87714 extends Type {
            private C87714(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper.Type
            public String getStateType() {
                return "momentChatRoom";
            }

            @Override // com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper.Type
            public int getType() {
                return 3;
            }
        }

        private static /* synthetic */ Type[] $values() {
            return new Type[]{momentState, quickChat, chatRoom, momentChatRoom};
        }

        static {
            momentState = new C87681("momentState", 0);
            quickChat = new C87692("quickChat", 1);
            chatRoom = new C87703("chatRoom", 2);
            momentChatRoom = new C87714("momentChatRoom", 3);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public String getStateType() {
            return "";
        }

        public int getType() {
            return 0;
        }

        private Type(String str, int i) {
            super(str, i);
        }
    }
}
