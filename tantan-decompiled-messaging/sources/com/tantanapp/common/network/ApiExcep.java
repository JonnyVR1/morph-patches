package com.tantanapp.common.network;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import p149l.exc0;
import p149l.stc0;

/* JADX INFO: loaded from: classes13.dex */
public class ApiExcep extends RuntimeException {
    public exc0 response;

    public static class ClientExpired extends ApiExcep {
        public ClientExpired(exc0 exc0Var) {
            super(exc0Var, "client expired");
        }
    }

    public static class ParseError extends ApiExcep {
        public ParseError(exc0 exc0Var, Exception exc, String str) {
            super(exc0Var, str.replace('\n', ' ') + "\n\n\n" + exc.getMessage());
        }
    }

    public static class RequestCancelled extends ApiExcep {
        public RequestCancelled(exc0 exc0Var) {
            super(exc0Var, "request cancelled");
        }
    }

    public static class Server extends ApiExcep {
        public Server(exc0 exc0Var) {
            super(exc0Var, "internal server error");
        }
    }

    public static class UploadedMediaNotFound extends ApiExcep {
        public UploadedMediaNotFound(exc0 exc0Var) {
            super(exc0Var, "uploaded media not found");
        }
    }

    public ApiExcep(exc0 exc0Var, String str) {
        super(getMessage(exc0Var, str));
        this.response = exc0Var;
    }

    public static String getMessage(exc0 exc0Var, String str) {
        String str2 = null;
        stc0 stc0VarM118604Y = exc0Var == null ? null : exc0Var.m118604Y();
        if (stc0VarM118604Y != null) {
            str2 = stc0VarM118604Y.m185877g() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + stc0VarM118604Y.m185881k();
        }
        if (str2 == null) {
            return str;
        }
        return str + " :: " + str2;
    }

    public static class Client extends ApiExcep {

        public static class Conflict extends Client {
            public Conflict(exc0 exc0Var) {
                super(exc0Var, "conflict");
            }
        }

        public static class Forbidden extends Client {
            public Forbidden(exc0 exc0Var) {
                super(exc0Var, "forbidden");
            }
        }

        public static class Gone extends Client {
            public Gone(exc0 exc0Var) {
                super(exc0Var, "gone");
            }
        }

        public static class ImATeapot extends Client {
            public ImATeapot(exc0 exc0Var) {
                super(exc0Var, "hahahah !!!!");
            }
        }

        public static class MethodNotAllowed extends Client {
            public MethodNotAllowed(exc0 exc0Var) {
                super(exc0Var, "method not allowed");
            }
        }

        public static class NotFound extends Client {
            public NotFound(exc0 exc0Var) {
                super(exc0Var, "not found");
            }
        }

        public static class RequestEntityTooLarge extends Client {
            public RequestEntityTooLarge(exc0 exc0Var) {
                super(exc0Var, "entity too large");
            }
        }

        public static class TooManyRequests extends Client {
            public final int resetInSeconds;

            public TooManyRequests(exc0 exc0Var, int i) {
                super(exc0Var, "too many requests. reset in " + i);
                this.resetInSeconds = i;
            }
        }

        public static class Unauthorized extends Client {
            public Unauthorized(exc0 exc0Var) {
                super(exc0Var, "unauthorized");
            }
        }

        public static class UnprocessableEntity extends Client {
            public UnprocessableEntity(exc0 exc0Var) {
                super(exc0Var, "unprocessable entity");
            }
        }

        public static class UnsupportedMediaType extends Client {
            public UnsupportedMediaType(exc0 exc0Var) {
                super(exc0Var, "unsupportd media type");
            }
        }

        public Client(exc0 exc0Var, String str) {
            super(exc0Var, str);
        }

        public static class BadRequest extends Client {
            public BadRequest(exc0 exc0Var) {
                super(exc0Var, "bad request");
            }

            public BadRequest(exc0 exc0Var, String str) {
                super(exc0Var, str);
            }
        }
    }
}
