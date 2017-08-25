package com.jimmy.builder;

public class Builder {
    private String title;
    private String message;
    private int id;

    private Builder(InnerBuilder builder) {
        this.title = builder.title;
        this.message = builder.message;
        this.id = builder.id;
    }

    public void print() {
        System.out.println("Builder" + " title: " + title + " message: " + message + " id: " + id);
    }

    public static class InnerBuilder {
        private String title;
        private String message;
        private int id;

        public InnerBuilder title(String title) {
            this.title = title;
            return this;
        }

        public InnerBuilder message(String message) {
            this.message = message;
            return this;
        }

        public InnerBuilder id(int id) {
            this.id = id;
            return this;
        }

        public Builder build() {
            return new Builder(this);
        }
    }
}
